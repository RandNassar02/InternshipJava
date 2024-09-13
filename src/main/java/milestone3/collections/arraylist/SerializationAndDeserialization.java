package milestone3.collections.arraylist;

import java.io.*;
import java.util.ArrayList;

public class SerializationAndDeserialization {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        try{
            FileOutputStream fos=new FileOutputStream("file");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();

            FileInputStream fis=new FileInputStream("file");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ArrayList list =(ArrayList)ois.readObject();

            System.out.println(list);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
