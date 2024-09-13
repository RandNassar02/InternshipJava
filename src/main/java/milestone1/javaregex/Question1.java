package milestone1.javaregex;

import java.util.regex.Pattern;

public class Question1 {
    /*Create a regular expression that accepts alphanumeric characters only.
Its length must be six characters long only.*/
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "rand28"));
    }
}
