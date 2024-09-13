package milestone3.javadateandtime.offsettime;

import java.time.OffsetTime;

public class GetMinute {
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();
        int m = offset.getMinute();
        System.out.println(m+ " minute");
    }
}
