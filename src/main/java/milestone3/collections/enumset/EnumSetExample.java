package milestone3.collections.enumset;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSetExample {
    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
        Iterator<days> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

    }
}