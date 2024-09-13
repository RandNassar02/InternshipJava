package milestone2.exceptionhandling.throwskeyword;

import java.io.IOException;
//A) If exception does not occur
class M2{
    void method()throws IOException {
        System.out.println("device operation performed");
    }
}
public class DeclareException {
    public static void main(String[] args) throws IOException {
        M2 m = new M2();
        m.method();
        System.out.println("normal flow..");
    }
}
