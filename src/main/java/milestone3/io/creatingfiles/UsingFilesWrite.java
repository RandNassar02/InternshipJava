package milestone3.io.creatingfiles;

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
            String data = "Test Data";
            Files.write(Paths.get("/home/rand-nassar/Desktop/Java/test2.txt"), data.getBytes());
            List<String> list= Arrays.asList("l1","l2");
            Files.write(Paths.get("file2.txt"),list, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            List<String> content=Files.readAllLines(Paths.get("/home/rand-nassar/Desktop/Java/test2.txt"));

            System.out.println(content);

            content=Files.readAllLines(Paths.get("file2.txt"));
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
