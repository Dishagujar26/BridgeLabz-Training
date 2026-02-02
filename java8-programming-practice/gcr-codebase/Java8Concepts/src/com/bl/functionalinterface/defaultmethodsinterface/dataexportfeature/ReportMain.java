package com.bl.functionalinterface.defaultmethodsinterface.dataexportfeature;
public class ReportMain {
    public static void main(String[] args) {

        ReportExporter exporter = new CsvExporter();
        exporter.export();
        exporter.exportToJSON();
    }
}
