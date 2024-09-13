package milestone3.newfeatures.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoop {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        list.forEach(
                (n)-> System.out.println(n)
        );
    }
}
