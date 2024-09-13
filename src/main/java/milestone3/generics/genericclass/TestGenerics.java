package milestone3.generics.genericclass;

public class TestGenerics {
    public static void main(String[] args) {
        MyGen<Integer> m=new MyGen<Integer>();
        m.add(2);
        //m.add("test");//Compile time error
        System.out.println(m.get());
    }
}
