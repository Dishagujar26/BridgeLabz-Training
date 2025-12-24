import java.time.ZonedDateTime;
import java.time.ZoneId;

// create a TimeZonesDemo class program that displays the current time in different time zones
public class TimeZonesDemo {
    public static void main(String[] args) {
        // Current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // Current time in IST
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Current time in PST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("GMT Time: " + gmtTime);
        System.out.println("IST Time: " + istTime);
        System.out.println("PST Time: " + pstTime);
    }
}
