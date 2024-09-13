package milestone2.exceptionhandling.throwskeyword;

import java.io.IOException;

public class ThrowsExample {
    void m() throws IOException {
        throw new IOException("device error");//checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        ThrowsExample t = new ThrowsExample();
        t.p();
        System.out.println("normal flow..");
    }
}
