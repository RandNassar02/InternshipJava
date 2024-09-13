package milestone1.javatutorial.operators.unary;

public class BitwiseComplementAndNOT {
    public static void main (String[] args){
        int a=10;
        int b=-10;

        boolean c=true;
        boolean d=false;

        System.out.println(~a);
        System.out.println(~b);

        /*
        Explanation:
~a: The bitwise NOT of 10 (which is 00001010 in binary) results in 11110101 in binary, which is -11 in decimal.
~b: The bitwise NOT of -10 (which is 11110110 in binary) results in 00001001 in binary, which is 9 in decimal.
         */

        System.out.println(!c);
        System.out.println(!d);

    }
}
