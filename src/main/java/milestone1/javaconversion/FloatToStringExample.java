package milestone1.javaconversion;

public class FloatToStringExample {
    public static void main(String[] args) {
        float f=12.3F;//F is the suffix for float

//        1) String.valueOf()
        String s=String.valueOf(f);
        System.out.println(s);

//        2) Float.toString()
        String s1=Float.toString(f);
        System.out.println(s1);
    }
}
