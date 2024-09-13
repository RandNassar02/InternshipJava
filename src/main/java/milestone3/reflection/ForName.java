package milestone3.reflection;

public class ForName {
    public static void main(String[] args) throws Exception {
        Class<?> c= Class.forName("reflection.Simple");
        System.out.println(c.getName());
    }
}
