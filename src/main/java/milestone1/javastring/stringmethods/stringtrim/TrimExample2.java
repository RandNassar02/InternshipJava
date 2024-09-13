package milestone1.javastring.stringmethods.stringtrim;

public class TrimExample2 {
    public static void main(String[] args) {
        String str = " abc ";

        if ((str.trim()).length() > 0) {
            System.out.println("Other than white spaces \n");
        } else {
            System.out.println("Only white spaces \n");
        }


        str = "     ";

        if ((str.trim()).length() > 0) {
            System.out.println("Other than white spaces \n");
        } else {
            System.out.println("Only white spaces \n");
        }
    }
}
