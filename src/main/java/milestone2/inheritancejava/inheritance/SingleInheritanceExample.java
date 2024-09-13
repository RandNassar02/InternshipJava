package milestone2.inheritancejava.inheritance;

//given below, Dog class inherits the Animal class
// Base class
class Animal{
    void eat(){System.out.println("eating...");}
}
// Derived class
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
