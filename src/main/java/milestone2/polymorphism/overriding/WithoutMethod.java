package milestone2.polymorphism.overriding;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

public class WithoutMethod extends Vehicle {
    public static void main(String[] args) {
        WithoutMethod obj = new WithoutMethod();
        obj.run();
    }
}
