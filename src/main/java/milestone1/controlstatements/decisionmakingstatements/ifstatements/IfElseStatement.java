package milestone1.controlstatements.decisionmakingstatements.ifstatements;

public class IfElseStatement {
    public static void main(String[] args) {

        System.out.println("num 1");
        int num = 10;
        if (num % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }


        System.out.println("-----------");

//        A year is leap, if it is divisible by 4 and 400. But, not by 100
        int year = 2020;
        if ((((year % 4 == 0) || (year % 400 == 0)) && (year % 100 != 0))) {
            System.out.println("leap");
        } else {
            System.out.println("COMMON");
        }


        System.out.println("--Using Ternary Operato--");
        int num2 = 13;
        String output = (num2 % 2 == 0) ? "even number" : "odd number";
        System.out.println(output);
    }
}
