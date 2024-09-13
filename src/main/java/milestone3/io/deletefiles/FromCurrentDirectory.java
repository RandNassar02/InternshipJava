package milestone3.io.deletefiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FromCurrentDirectory {
    public static void main(String[] args) throws IOException {
        BufferedWriter out=new BufferedWriter(new FileWriter("r.txt"));
        out.write("test data");
        out.close();

        File file=new File("r.txt");
        if(file.exists()){
            boolean success=file.delete();

            if (success){
                System.out.println("The file has been successfully deleted");
            }
            else {
                System.out.println("The file deletion failed");
            }
        }
        else {
            System.out.println("The file is not present");
        }
    }
}
