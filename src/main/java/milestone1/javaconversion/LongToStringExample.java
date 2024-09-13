package milestone1.javaconversion;

public class LongToStringExample {
    public static void main(String[] args) {

        long i=9993939399L;

//        1) String.valueOf()
        String s=String.valueOf(i);
        System.out.println(s);

//        2) Long.toString()
        String s2=Long.toString(i);
        System.out.println(s2);


    }
}
