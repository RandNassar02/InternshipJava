package milestone3.reflection;

public class ClassSyntax {
    public static void main(String[] args) {
        Class c=boolean.class;
        System.out.println(c.getName());

        Class c2= ClassSyntax.class;
        System.out.println(c2.getName());
    }
}
