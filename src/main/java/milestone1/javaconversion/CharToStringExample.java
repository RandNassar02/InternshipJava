package milestone1.javaconversion;

public class CharToStringExample {
    public static void main(String[] args) {
//        String.valueOf() method
        char c='S';
        String s=String.valueOf(c);
        System.out.println("String is: "+s);
//        Character.toString() method
        char c1='M';
        String s1=Character.toString(c1);
        System.out.println("String is: "+s1);
    }
}
