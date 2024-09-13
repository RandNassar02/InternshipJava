package milestone3.collections.arraylistandvector;

import java.util.Enumeration;
import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>(); // Now refers to java.util.Vector
        v.add("umesh");
        v.addElement("irfan");
        v.addElement("kumar");

        Enumeration<String> e = v.elements(); // Specify the type for Enumeration
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
