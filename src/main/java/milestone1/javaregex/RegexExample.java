package milestone1.javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("hello");
        Matcher m1 = p1.matcher("hello");
        boolean b1 = m1.matches();
        System.out.println(b1); //T

        Pattern p2 = Pattern.compile("hello");
        Matcher m2 = p2.matcher("helooo");
        boolean b2 = m2.find();
        System.out.println(b2); //F


        Pattern p3 = Pattern.compile(".s"); //. represents single character
        Matcher m3 = p3.matcher("as");
        boolean b3 = m3.matches();
        System.out.println(b3);///T

        //2nd way
        boolean b4 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b4);

        //3rd way
        boolean b5 = Pattern.matches(".s", "as");
        System.out.println(b5);


        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)
        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)
        System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)
        System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)
        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)
        System.out.println(Pattern.matches("...s", "maas"));//true (4rd char is s)
    }
}
