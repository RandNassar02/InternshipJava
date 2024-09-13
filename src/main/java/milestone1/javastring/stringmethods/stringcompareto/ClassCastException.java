package milestone1.javastring.stringmethods.stringcompareto;

import java.util.ArrayList;
import java.util.Collections;

//class Players {
//    private String name;
//
//    // constructor of the class
//    public Players(String str) {
//        name = str;
//    }
//}
//
//public class ClassCastException {
//    public static void main(String[] args) {
//
//        Players ronaldo = new Players("Ronaldo");
//        Players sachin = new Players("Sachin");
//        Players messi = new Players("Messi");
//        ArrayList<Players> al = new ArrayList<>();
//
//        al.add(ronaldo);
//        al.add(sachin);
//        al.add(messi);
//
//        Collections.binarySearch(al, "Sehwag", null);
//    }
//
//}


class Players implements Comparable<Players> {
    private String name;

    public Players(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Players other) {
        return this.name.compareTo(other.name);
    }
}

public class ClassCastException {
    public static void main(String[] args) {
        Players ronaldo = new Players("Ronaldo");
        Players sachin = new Players("Sachin");
        Players messi = new Players("Messi");
        ArrayList<Players> al = new ArrayList<>();

        al.add(ronaldo);
        al.add(sachin);
        al.add(messi);

        Collections.sort(al); // Sort the list before binary search
        int index = Collections.binarySearch(al, new Players("Sehwag"));
        System.out.println(index);
    }
}
