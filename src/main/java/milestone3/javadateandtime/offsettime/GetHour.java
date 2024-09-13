package milestone3.javadateandtime.offsettime;

import java.time.OffsetTime;

public class GetHour {
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();
        int h = offset.getHour();
        System.out.println(h+ " hour");
    }
}
