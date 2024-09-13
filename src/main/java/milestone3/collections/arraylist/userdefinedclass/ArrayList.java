package milestone3.collections.arraylist.userdefinedclass;

import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {
        //Creating user-defined class objects
        Student s1 = new Student(101, "so", 23);
        Student s2 = new Student(102, "Ra", 21);
        Student s3 = new Student(103, "Ha", 25);
        //creating arraylist
        java.util.ArrayList<Student> al = new java.util.ArrayList<Student>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);
        //Getting Iterator
        Iterator itr = al.iterator();
        //traversing elements of ArrayList object
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
