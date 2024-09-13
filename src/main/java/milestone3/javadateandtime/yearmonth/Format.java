package milestone3.javadateandtime.yearmonth;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Format {
    public static void main(String[] args) {
        YearMonth ym = YearMonth.now();
        String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
        System.out.println(s);
    }
}
