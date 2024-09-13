package milestone1.javaconversion;

public class StringToObjectExample {
    public static void main(String[] args) throws Exception {
        String s;
        s = "hello";
        Object obj=s;
        System.out.println(obj);

//        Class.forName() method returns the instance of Class class which can be used to get the metadata of any class
        Class c=Class.forName("java.lang.String");
        System.out.println("class name: "+c.getName());
        System.out.println("super class name: "+c.getSuperclass().getName());
    }
}
