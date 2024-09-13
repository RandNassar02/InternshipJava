package milestone3.javadateandtime.durationclass;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String[] args) {
        Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);
        System.out.println(d.get(ChronoUnit.SECONDS));
    }
}
