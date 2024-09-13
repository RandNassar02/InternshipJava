package milestone3.javadateandtime.offsettime;

import java.time.OffsetTime;

public class GetSecond {
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();
        int s = offset.getSecond();
        System.out.println(s+ " second");
    }
}
