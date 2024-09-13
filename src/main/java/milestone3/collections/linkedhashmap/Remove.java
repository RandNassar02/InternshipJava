package milestone3.collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
public class Remove {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(101,"Amit");
        map.put(102,"Vijay");
        map.put(103,"Rahul");

        System.out.println("Before remove :"+map);

        map.remove(102);
        System.out.println("After remove :"+map);

    }
}
