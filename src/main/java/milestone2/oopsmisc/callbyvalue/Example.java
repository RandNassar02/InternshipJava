package milestone2.oopsmisc.callbyvalue;

public class Example {
    int data = 50;

    void change(int data) {
        data = data + 100;//changes will be in the local variable only
    }

    public static void main(String[] args) {
        Example o = new Example();
        System.out.println("before change " + o.data);
        o.change(500);
        System.out.println("after change " + o.data);
    }
}
