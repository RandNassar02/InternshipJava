package milestone2.exceptionhandling.throwskeyword;

import java.io.IOException;

//B) If exception occurs
class M3{
    void method()throws IOException{
        throw new IOException("device error");
    }
}
public class DeclareException2 {
    public static void main(String[] args) throws IOException{
        M3 m = new M3();
        m.method();

        System.out.println("normal flow..");

    }
}
//Exception in thread "main" java.io.IOException: device error