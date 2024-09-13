package milestone1.javaconversion;

public class IntToCharExample {
    public static void main(String[] args) {
//        Typecasting
        int a=65;
        char c=(char)a;
        System.out.println(c);

        int a1=1;
        char c1=(char)a1;
        System.out.println(c1);

        int a2=1;
        char c2=(char)(a2+'0');
        System.out.println(c2);

        int a3='1';
        char c3=(char)a3;
        System.out.println(c3);

//        Character.forDigit()
        int REDIX=10;//redix 10 is for decimal number, for hexa use redix 16
        int a4=1;
        char c4=Character.forDigit(a4,REDIX);
        System.out.println(c4);

        int REDIX2=16;//redix 16 is for Hexadecimal value
        int a5=10;
        char c5=Character.forDigit(a5,REDIX2);
        System.out.println(c5);
    }
}
