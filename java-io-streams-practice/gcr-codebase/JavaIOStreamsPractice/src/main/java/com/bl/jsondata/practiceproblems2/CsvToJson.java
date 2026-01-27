package com.bl.jsondata.practiceproblems2;
import java.io.File;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CsvToJson {
    public static void main(String[] args) throws Exception {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();
        List<Object> rows = csvMapper.readerFor(Map.class)
                                                 .with(schema)
                                                 .readValues(new File("D:\\scenariospecifidir\\data.json"))
                                                 .readAll();
        ObjectMapper jsonMapper = new ObjectMapper();
        String json = jsonMapper.writeValueAsString(rows);
        System.out.println(json);
    }
}
