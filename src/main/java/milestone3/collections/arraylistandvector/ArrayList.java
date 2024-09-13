package milestone3.collections.arraylistandvector;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {


    List<String> al=new java.util.ArrayList<String>();
    al.add("Sonoo");
    al.add("Michael");
    al.add("Andy");

        Iterator itr= al.iterator();
        while ((itr.hasNext())){
            System.out.println(itr.next());
        }
    }
}
