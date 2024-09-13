package milestone3.io.filesandIO.example1;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        String content = "This is some text to write to a file.";
        try (FileWriter writer=new FileWriter("output.txt")){
            writer.write(content);

        }
    }
}
