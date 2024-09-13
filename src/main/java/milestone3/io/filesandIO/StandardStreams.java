package milestone3.io.filesandIO;

import java.io.IOException;
import java.io.InputStreamReader;

public class StandardStreams {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter char, 'q' to quit");

            char c;
            do {
                c = (char) cin.read();
                System.out.println(c);
            }
            while (c != 'q');
        } finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}
