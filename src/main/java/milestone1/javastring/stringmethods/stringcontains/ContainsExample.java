package milestone1.javastring.stringmethods.stringcontains;

public class ContainsExample {
    public static void main(String[] args) {
        String name ="What is your name";
        System.out.println(name.contains("name"));//T
        System.out.println(name.contains("age"));//F
        //Case Sensitive
        System.out.println(name.contains("Name"));//F
    }
}
