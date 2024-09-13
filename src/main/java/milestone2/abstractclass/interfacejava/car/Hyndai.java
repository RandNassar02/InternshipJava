package milestone2.abstractclass.interfacejava.car;

public class Hyndai implements Car{
    @Override
    public void drive() {
        System.out.println("Open the door using the key, put the key in switch, switch the engine, put gear to D");
    }

    @Override
    public void petrol() {
        System.out.println("Benzen 95");
    }

    @Override
    public void maintenance() {
        System.out.println("Any shop");
    }

    @Override
    public void engine() {
        System.out.println("1600cc");
    }

    @Override
    public void tires() {
        System.out.println("17/145");
    }
}
