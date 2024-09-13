package milestone2.javaobjectclass.methodjava.userdefined;

import java.util.Scanner;

public class CreateUserDefined {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        findEvenOdd(num);
    }


    //user defined method
    public static void findEvenOdd(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}


