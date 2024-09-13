package milestone3.io.writetofiles;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriterWrite {
    public static void main(String[] args) {
        try {
            File file = new File("/home/rand-nassar/Desktop/Java/test3.txt");

            //Create the file
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

            // Write Content
            FileWriter writer = new FileWriter(file);
            writer.write("Test data");
            writer.close();


            // read content
            FileReader reader = new FileReader(file);

            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                System.out.print(ch);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

