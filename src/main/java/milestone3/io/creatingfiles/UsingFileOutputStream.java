package milestone3.io.creatingfiles;

import java.io.*;

public class UsingFileOutputStream {
    public static void main(String[] args) {
        try {
            byte bWrite[]={65,66,67,68,69};
            OutputStream os=new FileOutputStream("test.txt");
            for (int x=0;x<bWrite.length;x++){
                os.write(bWrite[x]);
            }
            os.close();

            InputStream is=new FileInputStream("test.txt");
            int size=is.available();

            for (int i=0;i<size;i++){
                System.out.print((char) is.read()+" ");
            }
            is.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
