package com.bl.functionalinterface.defaultmethodsinterface.dataexportfeature;
public interface ReportExporter {

    void export();

    default void exportToJSON() {
        System.out.println("Exporting report to JSON");
    }
}
