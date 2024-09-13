package milestone3.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeNotRequired {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("hello");
        String s = (String) list1.get(0);//typecasting
//        After Generics, we don't need to typecast the object.
        List<String> list2 = new ArrayList<String>();
        list2.add("hello");
        String s1 = list2.get(0);
    }
}
