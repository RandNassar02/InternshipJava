package milestone3.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class StringObjectsReverseOrder {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al,Collections.reverseOrder());
        Iterator i=al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
