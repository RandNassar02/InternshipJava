package milestone3.javadateandtime.monthday;

import java.time.MonthDay;

public class IsValidYear {
    public static void main(String[] args) {
        MonthDay month = MonthDay.now();
        boolean b = month.isValidYear(2012);
        System.out.println(b);
    }
}
