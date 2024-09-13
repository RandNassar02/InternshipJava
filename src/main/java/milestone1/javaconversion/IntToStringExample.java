package milestone1.javaconversion;

public class IntToStringExample {
    public static void main(String[] args) {
//        1) String.valueOf()
        int i=200;
        String s=String.valueOf(i);
        System.out.println(s);
        System.out.println(s+100);//200100 because + is string concatenation operator
        System.out.println(i+100);//300 because + is binary plus operator

//        2) Integer.toString()
        System.out.println(i+100);//300 because + is binary plus operator
        System.out.println(s+100);//200100 because + is string concatenation operator

//        3) String.format()
        String s1=String.format("%d",i);
        System.out.println(s1);
    }
}
