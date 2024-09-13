package milestone3.reflection;

import java.lang.reflect.Modifier;

class Animal {
}

// put this class in different Dog.java file
public class DogExample extends Animal {
    public void display() {
        System.out.println("I am a dog.");
    }
}
class Main {
    public static void main(String[] args) {
        try {
            // create an object of Dog
            DogExample d1 = new DogExample();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // get name of the class
            String name = obj.getName();
            System.out.println("Name: " + name);

            // get the access modifier of the class
            int modifier = obj.getModifiers();

            // convert the access modifier to string
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            // get the superclass of Dog
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


