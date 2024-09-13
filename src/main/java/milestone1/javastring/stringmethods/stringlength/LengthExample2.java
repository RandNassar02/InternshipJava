package milestone1.javastring.stringmethods.stringlength;

public class LengthExample2 {
    public static void main(String[] args) {
        String str ="java";
        if(str.length()>0){
            System.out.println("String is not empty" +str.length());
        }
        str="";
        if(str.length()==0){
            System.out.println("String is empty"+str.length());
        }
    }
}
