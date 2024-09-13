package milestone2.abstractclass;
//Bike is an abstract class that contains only one abstract method run. Its implementation is provided by the AbstractMethod class.
abstract class Bike {
    abstract void run();
}

public class AbstractMethod extends Bike {
    void run() {
        System.out.println("run");
    }

    public static void main(String[] arge) {
        Bike bike = new AbstractMethod();
        bike.run();
    }
}
