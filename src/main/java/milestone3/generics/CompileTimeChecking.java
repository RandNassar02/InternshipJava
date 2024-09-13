package milestone3.generics;

import java.util.ArrayList;
import java.util.List;

public class CompileTimeChecking {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
//        list.add(32);//Compile Time Error
    }
}
