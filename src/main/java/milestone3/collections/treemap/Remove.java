package milestone3.collections.treemap;

import java.util.TreeMap;
public class Remove {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");

        System.out.println("Before remove :"+map);

        map.remove(102);
        System.out.println("After remove :"+map);
    }
}
