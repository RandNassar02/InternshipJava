package milestone1.javaconversion;

public class StringToCharExample {
    public static void main(String[] args) {
        String s="hello";
        char c=s.charAt(0);//returns h
        System.out.println("1st character is: "+c);

        String s1="hello";
        for(int i=0; i<s.length();i++){
            char c1 = s1.charAt(i);
            System.out.println("char at "+i+" index is: "+c1);
        }

        String s2="hello";
        char[] ch=s2.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println("char at "+i+" index is: "+ch[i]);
        }
    }
}
