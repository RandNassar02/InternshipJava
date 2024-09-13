package milestone1.javastring;

import java.util.Arrays;

public class Substring {
    public static void main(String[] args) {
        String s="RandNassar";
        System.out.println("Original String: " + s);
        System.out.println("Substring starting from index 4: " +s.substring(4));//Nassar
        System.out.println("Substring starting from index 0 to 4: "+s.substring(0,4)); //Rand
//        Using String.split() method:

        String text= new String("Hello, My name is Rand");

        /* Splits the sentence by the delimeter passed as an argument */
        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }
}
