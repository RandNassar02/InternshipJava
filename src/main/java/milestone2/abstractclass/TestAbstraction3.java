package milestone2.abstractclass;

//An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.

abstract class Bike2 {
    Bike2() {
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear changed");
    }
}

class Honda extends Bike2 {
    void run() {
        System.out.println("running safely..");
    }
}

public class TestAbstraction3 {
    public static void main(String[] args) {
        Bike2 obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
