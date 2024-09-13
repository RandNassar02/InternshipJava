package milestone3.io.deletefiles;

import java.io.File;

public class ThatDoesNotExist {
    public static void main(String[] args) {
        File file=new File("test2.txt");
        boolean success=file.delete();

        if(success){
            System.out.println("The file has been successfully deleted");
        }
        else {
            System.out.println("The file deletion failed");
        }
    }
}
