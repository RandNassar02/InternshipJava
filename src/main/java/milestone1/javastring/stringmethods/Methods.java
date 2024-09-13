package milestone1.javastring.stringmethods;

public class Methods {
    public static void main(String[] args) {
         System.out.println("toUpperCase() and toLowerCase() method");
        String s="Rand";
        System.out.println(s.toUpperCase());//RAND
        System.out.println(s.toLowerCase());//rand
        System.out.println(s);//Rand(no change in original)

        System.out.println("Java String trim() method");
        String s2="  Rand   ";
        System.out.println(s2);//  Rand
        System.out.println(s2.trim());//Rand

        System.out.println("Java String startsWith() and endsWith() method");
        String s3="Rand";
        System.out.println(s3.startsWith("Ra"));//true
        System.out.println(s3.endsWith("d"));//true

        System.out.println("Java String charAt() Method");
        String s4="Rand";
        System.out.println(s4.charAt(2));//n
        System.out.println(s4.charAt(0));//R

        System.out.println("Java String length() Method");
        String s5="Rand";
        System.out.println(s5.length());

        System.out.println("Java String intern() Method");
        String s6=new String("Rand");
        String s7=s6.intern();
        System.out.println(s7);//Rand

        System.out.println("Java String valueOf() Method");
        int a=11;
        String s8=String.valueOf(a);
        System.out.println(s8+10);//1110

        System.out.println("Java String replace() Method");
        String s9="Java is a programming language. Java is a platform. Java is an Island.";
        String replaceString=s9.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"
        System.out.println(replaceString);

    }
}
