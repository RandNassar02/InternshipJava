package milestone3.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class BasicCharsetExample {
    public static void main(String[] args) {
        Charset cs=Charset.forName("UTF-8");
        System.out.println(cs.displayName());
        System.out.println(cs.canEncode());

        String st="Welcome";

        ByteBuffer byteBuffer =ByteBuffer.wrap(st.getBytes());
        CharBuffer charBuffer=cs.decode(byteBuffer);

        ByteBuffer newbBuffer= cs.encode(charBuffer);
        while (newbBuffer.hasRemaining()){
            char ca=(char) newbBuffer.get();
            System.out.print(ca);
        }
        newbBuffer.clear();
    }
}
