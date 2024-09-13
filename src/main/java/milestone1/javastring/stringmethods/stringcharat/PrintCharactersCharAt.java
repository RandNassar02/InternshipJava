package milestone1.javastring.stringmethods.stringcharat;

public class PrintCharactersCharAt {
    public static void main(String[] args) {
//        Print Characters Presented at Odd Positions by Using the charAt() Method
        String str = "Welcome to Java";
        for (int i=0;i<str.length();i++){
            if(i%2!=0){
                System.out.println("Char at "+i+" place "+str.charAt(i));
            }
        }
    }
}
