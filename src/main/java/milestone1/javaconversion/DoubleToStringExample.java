package milestone1.javaconversion;

public class DoubleToStringExample {
    public static void main(String[] args) {
        double d=12.3;
//        1) String.valueOf()
        String s=String.valueOf(d);
        System.out.println(s);
//        2) Double.toString()
        String s1=Double.toString(d);
        System.out.println(s1);
    }
}
