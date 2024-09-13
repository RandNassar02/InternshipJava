package milestone3.io.filesandIO.example1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader=new BufferedReader(new FileReader("output.txt"))){
            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }
    }
}
