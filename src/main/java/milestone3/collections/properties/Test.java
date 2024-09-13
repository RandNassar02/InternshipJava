package milestone3.collections.properties;

import java.io.FileReader;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception{
        FileReader reader=new FileReader("db.properties");

        Properties p =new Properties();
        p.load(reader);

        System.out.println("user");
        System.out.println("password");
    }
}
