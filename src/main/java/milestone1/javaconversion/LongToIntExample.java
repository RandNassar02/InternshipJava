package milestone1.javaconversion;

public class LongToIntExample {
    public static void main(String[] args) {
        long l=200;
        int i=(int)l;
        System.out.println(i);

        Long l1= new Long(10L);
        int i1=l1.intValue();
        System.out.println(i1);
    }
}
