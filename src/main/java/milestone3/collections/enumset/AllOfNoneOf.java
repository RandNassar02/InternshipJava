package milestone3.collections.enumset;

import java.util.EnumSet;
import java.util.Set;
enum days2 {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class AllOfNoneOf {
    public static void main(String[] args) {

        Set<days2> set1 = EnumSet.allOf(days2.class);
        System.out.println("Week Days:"+set1);

        Set<days2> set2 = EnumSet.noneOf(days2.class);
        System.out.println("Week Days:"+set2);
    }
}
