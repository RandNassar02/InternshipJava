package milestone3.reflection;
class Simple2{}
interface My{}
public class TestReflection {
    public static void main(String[] args) {
        try{
            Class c=Class.forName("reflection.Simple2");
            System.out.println(c.isInterface());

            Class c2=Class.forName("reflection.My");
            System.out.println(c2.isInterface());

        }catch(Exception e){System.out.println(e);}

    }
}
