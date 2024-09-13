package milestone3.newfeatures.defaultmethods;
interface Sayable2{
    // default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);
    // static method
    static void sayLouder(String msg){
        System.out.println(msg);
    }
}
public class StaticMethodsInterface implements Sayable2{

    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        StaticMethodsInterface dm=new StaticMethodsInterface();

        dm.say();
        dm.sayMore("Work is worship");
        Sayable2.sayLouder("Hello...........");
    }
}
