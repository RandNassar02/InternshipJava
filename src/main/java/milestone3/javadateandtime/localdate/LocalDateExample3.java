package milestone3.javadateandtime.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateExample3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 7, 8);
        LocalDateTime dateTime = date.atTime(1, 50, 9);
        System.out.println(dateTime);
    }
}