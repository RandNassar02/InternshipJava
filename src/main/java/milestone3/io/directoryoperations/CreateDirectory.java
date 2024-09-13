package milestone3.io.directoryoperations;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        String dirname = "/tmp/user/java/bin";
        File directory = new File(dirname);

        // Create directory now.
        directory.mkdirs();

        // create new file object
        File file = new File("/tmp/user/java/bin");

        System.out.println(file.exists());
    }
}
