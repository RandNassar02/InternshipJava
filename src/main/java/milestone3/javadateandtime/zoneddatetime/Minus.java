package milestone3.javadateandtime.zoneddatetime;

import java.time.Period;
import java.time.ZonedDateTime;

public class Minus {
    public static void main(String[] args) {
        ZonedDateTime zone= ZonedDateTime.now();
        ZonedDateTime m = zone.minus(Period.ofDays(126));
        System.out.println(m);
    }
}
