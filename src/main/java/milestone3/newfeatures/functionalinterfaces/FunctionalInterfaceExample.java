package milestone3.newfeatures.functionalinterfaces;
interface sayable{
    void say(String msg);
}
public class FunctionalInterfaceExample implements sayable{
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample fie=new FunctionalInterfaceExample();
        fie.say("Hello");
    }
}
