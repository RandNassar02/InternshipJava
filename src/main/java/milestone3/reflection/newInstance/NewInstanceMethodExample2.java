package milestone3.reflection.newInstance;

// important import statements

import javax.swing.*;

import static java.lang.System.out;

public class NewInstanceMethodExample2 {
    // Allowing Java Virtual Machine to handle the ClassNotFoundException
// main method
    public static void main(String[] args) throws ClassNotFoundException {
        Object ob = null;
        Class classDefinition = Class.forName("javax.swing.JLabel");
//        ob = classDefinition.newInstance();

        // instance variable for holding the instance of the class
        JLabel l1;

        // checking whether the created object ob is
// the instance of JLabel or not.
// If yes, do the typecasting; otherwise, terminate the method
        if (ob instanceof JLabel) {
            l1 = (JLabel) ob;
        } else {
            return;
        }

// reaching here means the typecasting has been done
// now we can invoke the getText() method
        out.println(l1.getText());


    }
}
