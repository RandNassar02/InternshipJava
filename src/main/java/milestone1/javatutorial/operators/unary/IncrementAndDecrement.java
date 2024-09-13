package milestone1.javatutorial.operators.unary;

public class IncrementAndDecrement {
    public static void main(String[] args){
        int x=10;

        System.out.println(x);   // Output: 10
        System.out.println(x++); // Output: 10 (x is incremented after this statement)
        System.out.println(++x); // Output: 12 (x is incremented before this statement)
        System.out.println(x--); // Output: 12 (x is decremented after this statement)
        System.out.println(--x); // Output: 10 (x is decremented before this statement)
        System.out.println(x);   // Output: 10

        int a=10;
        int b=10;
        System.out.println(a++ + ++a);
        System.out.println(b++ + b++ );
    }
}
