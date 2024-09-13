package milestone3.javadateandtime.yearclass;

import java.time.LocalDate;
import java.time.Year;

public class AtDay {
    public static void main(String[] args) {
        Year y = Year.of(2017);
        LocalDate l = y.atDay(123);
        System.out.println(l);
    }
}
