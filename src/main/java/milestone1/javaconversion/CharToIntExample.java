package milestone1.javaconversion;

public class CharToIntExample {
    public static void main(String[] args) {
//        Get ASCII value
        char c1='a';
        char c2='1';
        int a=c1;
        int b=c2;
        System.out.println(a);
        System.out.println(b);

//        Character.getNumericValue()
        char c3='1';
        int a2=Character.getNumericValue(c3);
        System.out.println(a2);

//        String.valueOf()
        char c4='1';
        int a3=Integer.parseInt(String.valueOf(c4));
        System.out.println(a3);
    }
}
