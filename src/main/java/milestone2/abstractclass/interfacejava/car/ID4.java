package milestone2.abstractclass.interfacejava.car;

public class ID4 implements Car {
    @Override
    public void drive() {
        System.out.println("Open door through remote key, once entered the car you can start the car by using the start engine button");
    }

    @Override
    public void petrol() {
        System.out.println("Electric");
    }

    @Override
    public void maintenance() {
        System.out.println("Only in the company");
    }

    @Override
    public void engine() {
        System.out.println("77KW");
    }

    @Override
    public void tires() {
        System.out.println("20/255");
    }
}
