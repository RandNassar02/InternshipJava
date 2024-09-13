package milestone2.innerclass.localinner;

public class LocalInnerExample {
    private int data = 30;

    void display() {
        class Local {
            void msg() {
                System.out.println(data);
            }

        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        LocalInnerExample l = new LocalInnerExample();
        l.display();
    }
}
