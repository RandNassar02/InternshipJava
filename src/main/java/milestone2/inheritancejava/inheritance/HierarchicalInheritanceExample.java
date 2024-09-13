package milestone2.inheritancejava.inheritance;

//given below, Dog and Cat classes inherits the Animal class

abstract class Animal2{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog2 extends Animal2{
    void bark(){
        System.out.println("barking...");
    }
}
class Cat2 extends Animal2{
    void meow(){
        System.out.println("meowing...");
    }
}
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Cat2 c=new Cat2();
        c.meow();
        c.eat();
//c.bark();
    }
}
