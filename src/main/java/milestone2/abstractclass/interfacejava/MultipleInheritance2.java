package milestone2.abstractclass.interfacejava;

interface Printable2 {
    void print();
}

interface Showable2 {
    void print();
}

public class MultipleInheritance2 implements Printable2, Showable2 {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        MultipleInheritance2 obj = new MultipleInheritance2();
        obj.print();
    }
}
