package milestone3.javadateandtime.zoneoffset;

import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class IsSupported {
    public static void main(String[] args) {
        ZoneOffset zone = ZoneOffset.UTC;
        boolean b1 = zone.isSupported(ChronoField.OFFSET_SECONDS);
        System.out.println(b1);
        boolean b2 = zone.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println(b2);
    }
}
