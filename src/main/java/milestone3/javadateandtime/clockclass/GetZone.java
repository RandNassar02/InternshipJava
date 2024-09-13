package milestone3.javadateandtime.clockclass;

import java.time.Clock;

public class GetZone {
    public static void main(String[] args) {
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());
    }
}
