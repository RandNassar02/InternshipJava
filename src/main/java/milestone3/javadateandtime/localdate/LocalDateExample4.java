package milestone3.javadateandtime.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample4 {
    public static void main(String[] args) {
        System.out.println("EX 1");
        LocalDate d1 = LocalDate.now();
        String d1Str = d1.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date 1 " + d1Str);

        System.out.println("EX 2");
        LocalDate d2 = LocalDate.of(2002, 8, 28);
        String d2Str = d2.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date 2 " + d2Str);

        System.out.println("EX 3");
        LocalDate d3 = LocalDate.of(2022, 8, 29);
        String d3Str = d3.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date 3 " + d3Str);
    }
}
