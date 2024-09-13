package milestone1.javaconversion;

public class IntToLongExample {
    public static void main(String[] args) {
        int i=200;
        long l=i;
        System.out.println(l);

        int i2=100;
        Long l2= new Long(i2);//first way
        Long l3=Long.valueOf(i2);//second way
        System.out.println(l2);
        System.out.println(l3 );

    }
}
