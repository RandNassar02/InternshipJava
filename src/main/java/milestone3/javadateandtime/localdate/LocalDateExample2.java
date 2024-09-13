package milestone3.javadateandtime.localdate;

import java.time.LocalDate;

public class LocalDateExample2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 8, 28);
        System.out.println(date.isLeapYear());

        LocalDate date2 = LocalDate.of(2024, 8, 29);
        System.out.println(date2.isLeapYear());
    }
}
