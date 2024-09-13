package milestone3.javadateandtime.clockclass;

import java.time.Clock;

public class Instant {
    public static void main(String[] args) {
        Clock c = Clock.systemUTC();
        System.out.println(c.instant());
    }
}
