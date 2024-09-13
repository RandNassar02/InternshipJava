package milestone3.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class FromAnotherCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        HashSet<String> set = new HashSet(list);
        set.add("Gaurav");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
