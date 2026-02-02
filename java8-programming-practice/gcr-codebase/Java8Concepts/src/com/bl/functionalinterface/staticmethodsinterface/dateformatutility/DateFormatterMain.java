package com.bl.functionalinterface.staticmethodsinterface.dateformatutility;
import java.time.LocalDate;

public class DateFormatterMain {
    public static void main(String[] args) {

        String date =
                DateFormatterUtil.format(LocalDate.now(), "dd-MM-yyyy");

        System.out.println("Formatted Date: " + date);
    }
}
