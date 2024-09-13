package milestone3.javadateandtime.offsetdatetime;

import java.time.OffsetDateTime;

public class GetDayOfMonth {
    public static void main(String[] args) {
        OffsetDateTime offsetDT = OffsetDateTime.now();
        System.out.println(offsetDT.getDayOfMonth());
    }
}
