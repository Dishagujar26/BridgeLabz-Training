package com.bl.csvdatahandling.convertjsontocsvandviceversa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonCsvConverter {

    public static void main(String[] args) throws Exception {
    	//D:\\scenariospecifidir\\stucsctojson.csv path where to create
        jsonToCsv("D:\\scenariospecifidir\\student.json", "D:\\scenariospecifidir\\stucsctojson.csv");
        csvToJson("D:\\scenariospecifidir\\stucsctojson.csv", "D:\\scenariospecifidir\\students_converted.json");
    }

    // JSON → CSV
    static void jsonToCsv(String jsonFile, String csvFile) throws Exception {

        String jsonData = new String(Files.readAllBytes(Paths.get(jsonFile)));
        JSONArray array = new JSONArray(jsonData);

        FileWriter fw = new FileWriter(csvFile);
        fw.write("ID,Name,Age,Email,Phone\n");

        for (int i = 0; i < array.length(); i++) {
            JSONObject obj = array.getJSONObject(i);

            fw.write(
                    obj.getInt("id") + "," +
                    obj.getString("name") + "," +
                    obj.getInt("age") + "," +
                    obj.getString("email") + "," +
                    obj.getString("phone") + "\n"
            );
        }
        fw.close();
    }

    // CSV → JSON
    static void csvToJson(String csvFile, String jsonFile) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        JSONArray array = new JSONArray();
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            JSONObject obj = new JSONObject();
            obj.put("id", Integer.parseInt(data[0]));
            obj.put("name", data[1]);
            obj.put("age", Integer.parseInt(data[2]));
            obj.put("email", data[3]);
            obj.put("phone", data[4]);

            array.put(obj);
        }
        br.close();

        FileWriter fw = new FileWriter(jsonFile);
        fw.write(array.toString(4)); // formatted JSON
        fw.close();
    }
}
