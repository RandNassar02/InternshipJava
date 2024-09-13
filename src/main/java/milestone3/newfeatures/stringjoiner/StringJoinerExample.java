package milestone3.newfeatures.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner joinName = new StringJoiner(","); // passing comma(,) as delimiter

        // Adding values to StringJoiner
        joinName.add("R");
        joinName.add("A");
        joinName.add("N");
        joinName.add("D");

        System.out.println(joinName);
    }
}
