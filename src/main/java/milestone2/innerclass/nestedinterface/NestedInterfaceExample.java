package milestone2.innerclass.nestedinterface;

interface Showable {
    void show();

    interface Message {
        void msg();
    }
}

public class NestedInterfaceExample implements Showable.Message {
    public void msg() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Showable.Message s = new NestedInterfaceExample();
        s.msg();
    }
}
