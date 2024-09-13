package milestone1.javaregex;

import java.util.regex.Pattern;

public class Question2 {
    /*Create a regular expression that accepts 10 digit numeric characters
 starting with 7, 8 or 9 only.*/

    public static void main(String[] args) {
        System.out.println(Pattern.matches("[789]{1}[1-9]{9}", "8792341272"));
    }
}
