package milestone3.newfeatures.base64encodedecode;

import java.util.Base64;

public class URLEncodingAndDecoding {
    public static void main(String[] args) {
        Base64.Encoder encoder=Base64.getEncoder();

        String eStr=encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());

        System.out.println("Encoded URL:"+eStr);

        Base64.Decoder decoder=Base64.getDecoder();

        String dStr=new String(decoder.decode(eStr));

        System.out.println("Decoded URL:"+dStr);
    }
}
