package milestone2.encapsulation.accessmodifiers.privateaccess;

class A {
    private int data = 40;

    private void msg() {
        System.out.println("Hello java");
    }
}

public class SimpleExample {
    public static void main(String[] args) {
        A a = new A();
        //Compile Time Error
//        System.out.println(a.data);
//        a.msg;
    }
}
