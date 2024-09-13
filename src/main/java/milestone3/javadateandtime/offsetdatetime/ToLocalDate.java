package milestone3.javadateandtime.offsetdatetime;

import java.time.OffsetDateTime;

public class ToLocalDate {
    public static void main(String[] args) {
        OffsetDateTime offsetDT = OffsetDateTime.now();
        System.out.println(offsetDT.toLocalDate());
    }
}
