package milestone3.javadateandtime.zoneId;

import java.time.ZoneId;

public class GetId {
    public static void main(String[] args) {
        ZoneId z = ZoneId.systemDefault();
        String s = z.getId();
        System.out.println(s);
    }
}
