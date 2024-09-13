package milestone3.javadateandtime.offsetdatetime;

import java.time.OffsetDateTime;

public class PlusDays {
    public static void main(String[] args) {
        OffsetDateTime offset = OffsetDateTime.now();
        OffsetDateTime value =  offset.plusDays(240);
        System.out.println(value);
    }
}
