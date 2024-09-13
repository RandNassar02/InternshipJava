package milestone3.javadateandtime.zoneddatetime;
import java.time.ZonedDateTime;
public class GetZone {
    public static void main(String[] args) {
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone.getZone());
    }
}
