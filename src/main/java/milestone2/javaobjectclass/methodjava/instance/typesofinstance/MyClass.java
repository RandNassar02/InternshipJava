package milestone2.javaobjectclass.methodjava.instance.typesofinstance;


abstract class Demo //abstract class
{
    abstract void display();
}

public class MyClass extends Demo {
    void display() {
        System.out.println("Abstract method?");
    }

    public static void main(String args[]) {
//creating object of abstract class
        Demo obj = new MyClass();
        obj.display();
    }
}