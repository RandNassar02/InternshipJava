package milestone3.javadateandtime.yearclass;

import java.time.Year;

public class IsLeap {
    public static void main(String[] args) {
        Year year = Year.of(2016);
        System.out.println(year.isLeap());
    }
}
