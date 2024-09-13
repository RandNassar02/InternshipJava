package milestone3.collections.arraylist;

//import javadateandtime.clockclass.Instant;


import java.time.Instant;
import java.util.ArrayList;

public class SizeAndCapacity2 {
    public static void main(String[] args) {
        ArrayList<Instant> al=new ArrayList<>(10);

        System.out.println("The size :"+al.size());
    }
}
