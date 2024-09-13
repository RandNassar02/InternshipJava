package milestone3.javadateandtime.zoneddatetime;

import java.time.Period;
import java.time.ZonedDateTime;

public class Plus {
    public static void main(String[] args) {
        ZonedDateTime zone= ZonedDateTime.now();
        ZonedDateTime p = zone.plus(Period.ofDays(126));
        System.out.println(p);
    }
}
