package milestone2.inheritancejava.inheritance;
//Programmer is the subclass and Employee is the superclass.
//class TestInheritance is  class Programmer

    class Employee {
    float salary = 40000;
}

class TestInheritance extends Employee {
    int bonus = 10000;

    public static void main(String[] args) {
        TestInheritance p = new TestInheritance();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}

