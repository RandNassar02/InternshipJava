package milestone1.controlstatements.decisionmakingstatements.ifstatements;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int marke = 77;

        if (marke < 50) {
            System.out.println("F");
        } else if (marke >= 50 && marke < 60) {
            System.out.println("D");
        } else if (marke >= 60 && marke < 70) {
            System.out.println("C");
        } else if (marke >= 70 && marke < 80) {
            System.out.println("B");
        } else if (marke >= 80 && marke < 90) {
            System.out.println("A");
        } else if (marke >= 90 && marke <= 100) {
            System.out.println("A+");
        } else {
            System.out.println("Invalid!!");
        }

        System.out.println("---check POSITIVE, NEGATIVE or ZERO---");
        int num = -20;
        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero number");
        }
    }
}
