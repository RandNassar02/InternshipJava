package milestone2.javaobjectclass.objectsandclass.initializeobject;

class Student{
    int id;
    String name;
}

public class InitializationThroughReference {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Rand";
        s1.id = 2;
        s2.name = "Nassar";
        s2.id = 35;

        System.out.println(s1.name+" "+s1.id);
        System.out.println(s2.name+" "+s2.id);
    }
}
