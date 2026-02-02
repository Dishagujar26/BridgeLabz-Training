package com.bl.functionalinterface.staticmethodsinterface.dateformatutility;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatterUtil {

    static String format(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}
