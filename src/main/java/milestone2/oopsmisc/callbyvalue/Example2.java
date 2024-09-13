package milestone2.oopsmisc.callbyvalue;

public class Example2 {
    int data = 50;

    void change(Example2 op) {
        op.data = op.data + 100;//changes will be in the instance variable
    }

    public static void main(String[] args) {
        Example2 op = new Example2();
        System.out.println("before change "+op.data);
        op.change(op);
        System.out.println("after change "+op.data);
    }
}
