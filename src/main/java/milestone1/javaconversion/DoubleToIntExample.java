package milestone1.javaconversion;

public class DoubleToIntExample {
    public static void main(String[] args) {
        double d=10.5;
        int i=(int)d;
        System.out.println(i);

        Double d1=new Double(10.5);
        int i1=d1.intValue();
        System.out.println(i1);
    }
}
