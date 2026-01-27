package com.bl.jsondata.problemstatement;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class IPLCensorAnalyzer {

	// Mask team name: keep first word, replace rest with ***
	private static String maskTeam(String team) {
		String[] parts = team.split(" ");
		if (parts.length > 1)
			return parts[0] + " ***";
		else
			return team;
	}

	// Censor JSON
	public static void censorJson(String inputFile, String outputFile) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		ArrayNode matches = (ArrayNode) mapper.readTree(new File(inputFile));

		for (JsonNode matchNode : matches) {
			ObjectNode match = (ObjectNode) matchNode;

			// Mask teams
			match.put("team1", maskTeam(match.get("team1").asText()));
			match.put("team2", maskTeam(match.get("team2").asText()));
			match.put("winner", maskTeam(match.get("winner").asText()));

			// Redact player of match
			match.put("player_of_match", "REDACTED");
		}

		mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), matches);
		System.out.println("Censored JSON written to " + outputFile);
	}

	// Censor CSV

	public static void censorCsv(String inputFile, String outputFile) throws IOException {
		CsvMapper csvMapper = new CsvMapper();
		CsvSchema schema = CsvSchema.emptySchema().withHeader();

		// Read CSV as List<Object>
		List<Object> rows = csvMapper.readerFor(Map.class).with(schema).readValues(new File(inputFile)).readAll();

		// Apply censorship
		for (Object obj : rows) {
			@SuppressWarnings("unchecked")
			Map<String, String> row = (Map<String, String>) obj; // cast to Map
			row.put("team1", maskTeam(row.get("team1")));
			row.put("team2", maskTeam(row.get("team2")));
			row.put("winner", maskTeam(row.get("winner")));
			row.put("player_of_match", "REDACTED");
		}

		// Write censored CSV
		@SuppressWarnings("unchecked")
		CsvSchema outputSchema = CsvSchema.builder()
				.addColumns(((Map<String, String>) rows.get(0)).keySet(), CsvSchema.ColumnType.STRING).build()
				.withHeader();
		csvMapper.writer(outputSchema).writeValues(new File(outputFile)).writeAll(rows);
		System.out.println("Censored CSV written to " + outputFile);
	}

	public static void main(String[] args) throws IOException {
		// JSON
		censorJson("D:\\scenariospecifidir\\ipl_matches.json", "D:\\scenariospecifidir\\ipl_matches_censored.json");

		// CSV
		censorCsv("D:\\scenariospecifidir\\ipl_matches.csv", "D:\\scenariospecifidir\\ipl_matches_censored.csv");
	}
}
