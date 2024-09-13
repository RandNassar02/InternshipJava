package milestone3.io.directoryoperations;

import java.io.File;

public class DeletingDirectories {
    public static void main(String[] args) {
        File file = new File("/tmp/user/java/bin");
        if(file.exists()) {
            boolean success = file.delete();

            if (success) {
                System.out.println("The directory has been successfully deleted.");
            }else {
                System.out.println("The directory deletion failed.");
            }
        }else {
            System.out.println("The directory is not present.");
        }
    }
}
