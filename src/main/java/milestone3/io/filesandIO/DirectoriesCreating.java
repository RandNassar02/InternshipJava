package milestone3.io.filesandIO;

import java.io.File;

public class DirectoriesCreating {
    public static void main(String[] args) {
        String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);

        // Create directory now.
        d.mkdirs();
    }
}
