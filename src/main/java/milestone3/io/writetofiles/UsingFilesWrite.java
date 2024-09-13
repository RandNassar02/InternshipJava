package milestone3.io.writetofiles;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class UsingFilesWrite {
    public static void main(String[] args) {
        try {
            String data = "Test data";
            Files.write(Paths.get("/home/rand-nassar/Desktop/Java/test4.txt"), data.getBytes());
            List<String> lines = Arrays.asList("1st line", "2nd line");
            Files.write(Paths.get(
                            "file4.txt"), lines, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            List<String> content = Files.readAllLines(Paths.get("/home/rand-nassar/Desktop/Java/test4.txt"));

            System.out.println(content);

            content = Files.readAllLines(Paths.get("file4.txt"));

            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}