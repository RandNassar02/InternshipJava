package milestone3.newfeatures.lambdaexpressions;
//Java Lambda Expression Example: No Parameter




interface Sayable{
    public String say();
}
public class NoParameter {
    public static void main(String[] args) {
        Sayable s=()->{
            return "I have nothing to say";
        };
        System.out.println(s.say());
    }
}
