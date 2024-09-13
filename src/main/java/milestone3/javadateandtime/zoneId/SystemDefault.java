package milestone3.javadateandtime.zoneId;

import java.time.ZoneId;

public class SystemDefault {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
    }
}
