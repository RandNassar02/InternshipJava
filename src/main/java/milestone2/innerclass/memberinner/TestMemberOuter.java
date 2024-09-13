package milestone2.innerclass.memberinner;

public class TestMemberOuter {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        TestMemberOuter t = new TestMemberOuter();
        Inner in = t.new Inner();
        in.msg();
    }
}
