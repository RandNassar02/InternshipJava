package milestone3.javadateandtime.localdate;

import java.time.LocalDate;

public class LocalDateExample5 {
    public static void main(String[] args) {
        String dStr = "2002-08-28";
        LocalDate d1 = LocalDate.parse(dStr);
        System.out.println("String to LocalDate : " + d1);

        String dInStr2 = "2015-11-20";
        LocalDate d2 = LocalDate.parse(dInStr2);
        System.out.println("String to LocalDate : " + d2);
    }
}
