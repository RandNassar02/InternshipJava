package milestone3.javadateandtime.monthday;

import java.time.LocalDate;
import java.time.MonthDay;

public class MonthDayExample {
    public static void main(String[] args) {
        MonthDay month = MonthDay.now();
        LocalDate date = month.atYear(2002);
        System.out.println(date);
    }
}
