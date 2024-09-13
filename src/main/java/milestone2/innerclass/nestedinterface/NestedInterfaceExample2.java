package milestone2.innerclass.nestedinterface;
class A{
    interface Message{
        void msg();
    }
}

public class NestedInterfaceExample2 implements A.Message {
    public void msg(){
        System.out.println("Message");
    }
    public static void main(String[] args) {
        A.Message m = new NestedInterfaceExample2();
        m.msg();
    }
}
