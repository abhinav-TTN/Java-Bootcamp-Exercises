package Q6;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Part2 {
    public static void main(String[] args) {
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime nyc = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime tky = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("Current time in India:\n" + ist);
        System.out.println("\nCurrent time in New York:\n" + nyc);
        System.out.println("\nCurrent time in Tokyo:\n" + tky);
    }
}
