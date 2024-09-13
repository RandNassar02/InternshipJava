package milestone1.controlstatements.decisionmakingstatements.ifstatements;

public class NestedIfStatement {
    public static void main(String[] args) {
        int age = 20;
        int weigth = 55;

        if (age >= 18) {
            if (weigth > 50) {
                System.out.println("You are eligible to donate blood");
            }
        }
        System.out.println("---------------");
        int age2 = 25;
        int weigth2 = 55;
        if (age2 >= 18) {
            if (weigth2 > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");
            }
        } else {
            System.out.println("Age must be greater than 18");
        }
    }
}
