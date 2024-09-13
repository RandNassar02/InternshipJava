package milestone1.javaconversion;

public class StringToIntExample {
    public static void main (String[] args){

        //using Integer.parseInt() method
        String s="200";
        int i=Integer.parseInt(s);
        System.out.println(i);
        System.out.println(s+100); //200100, because "200"+100, here + is a string concatenation operator
        System.out.println(i+100);//300, because 200+100, here + is a binary plus operator

        //using Integer.valueOf() method
        Integer i1=Integer.valueOf(s);
        System.out.println(i1);

//        NumberFormatException Case
//        String s1="hello";
//        int i2=Integer.parseInt(s1);
//        System.out.println(i2);
    }
}
