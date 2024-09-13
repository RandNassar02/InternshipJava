package milestone3.collections.treeset;

import java.util.TreeSet;
public class HighestLowestValue {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);

        System.out.println("Lowest : "+set.pollFirst());
        System.out.println("Highesr : "+set.pollLast());

    }
}
