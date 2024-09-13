package milestone3.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeSafety {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("10");
//    With Generics, it is required to specify the type of object we need to store.
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
//        list1.add("10");// compile-time error
    }
}