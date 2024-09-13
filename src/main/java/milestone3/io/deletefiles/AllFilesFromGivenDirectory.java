package milestone3.io.deletefiles;

import java.io.File;

public class AllFilesFromGivenDirectory {
    public static void deleteFiles(File dirPath){
        File fileList[]=dirPath.listFiles();
        for (File file:fileList){
            if (file.isFile()){
                file.delete();
            }
            else {
                deleteFiles(file);
            }
        }
    }
    public static void main(String[] args) {
        File file=new File("/home/rand-nassar/Desktop/Java");
        deleteFiles(file);
        System.out.println("Files deleted");
    }
}
