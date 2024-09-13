package milestone2.abstractclass.interfacejava;
interface Printable3{
    void print();
}
interface Showable3 extends Printable3{
    void show();
}
public class InterfaceInheritance implements Showable3{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String[] args){
        InterfaceInheritance obj = new InterfaceInheritance();
        obj.print();
        obj.show();
    }
}
