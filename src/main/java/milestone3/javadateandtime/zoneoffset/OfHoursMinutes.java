package milestone3.javadateandtime.zoneoffset;

import java.time.ZoneOffset;

public class OfHoursMinutes {
    public static void main(String[] args) {
        ZoneOffset zone = ZoneOffset.ofHoursMinutes(5,30);
        System.out.println(zone);
    }
}
