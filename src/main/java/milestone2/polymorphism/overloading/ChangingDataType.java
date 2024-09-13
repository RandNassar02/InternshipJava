package milestone2.polymorphism.overloading;

class Adder2 {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

public class ChangingDataType {
    public static void main(String[] args) {
        System.out.println(Adder2.add(1, 2));
        System.out.println(Adder2.add(1.5, 1.6));
    }
}
