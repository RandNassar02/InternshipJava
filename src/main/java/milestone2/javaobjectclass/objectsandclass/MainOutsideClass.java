package milestone2.javaobjectclass.objectsandclass;

public class MainOutsideClass {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.name);
        System.out.println(s.id);
    }
}

class Student{
    int id;
    String name;
}
