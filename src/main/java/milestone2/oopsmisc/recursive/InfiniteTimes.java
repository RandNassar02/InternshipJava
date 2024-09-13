package milestone2.oopsmisc.recursive;

public class InfiniteTimes {
    static void p() {
        System.out.println("hello");
        p();
    }

    public static void main(String[] args) {
        p();
    }
}
