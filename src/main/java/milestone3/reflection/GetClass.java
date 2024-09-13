package milestone3.reflection;
class Simple{}
public class GetClass {
    void printNAme(Object obj){
        Class c=obj.getClass();
        System.out.println(c.getName());
    }
    public static void main(String[] args) {
        Simple s=new Simple();
        GetClass aClass=new GetClass();
        aClass.printNAme(s);

    }
}
