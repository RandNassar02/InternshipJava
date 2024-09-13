package milestone3.newfeatures.lambdaexpressions;

interface Sayable3{
    String say(String message);
}

public class MultipleStatements {
    public static void main(String[] args) {
        Sayable3 sayable3 =(message)->{
            String str1="I would like to say,";
            String str2=str1+message;
            return str2;
        };

        System.out.println(sayable3.say("time is precious"));
    }
}
