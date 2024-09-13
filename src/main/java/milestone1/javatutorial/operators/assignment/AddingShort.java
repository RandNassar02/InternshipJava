package milestone1.javatutorial.operators.assignment;

public class AddingShort {
    public static void main(String[] args){
        short a=10;
        short b=10;

        a+=b;
//        a=a+b;//Compile time error
        System.out.println(a);

        short c=10;
        short d=10;
        c=(short)(c+d);
        System.out.println(c);


    }
}
