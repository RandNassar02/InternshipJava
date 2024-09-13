package milestone2.abstractclass.interfacejava;

interface printable {
    void print();
}

public class InterfaceExample implements printable {
    public void print() {
        System.out.println("print");
    }
    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.print();
    }
}
