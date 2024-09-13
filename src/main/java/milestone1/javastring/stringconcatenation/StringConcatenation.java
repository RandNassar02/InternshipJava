package milestone1.javastring.stringconcatenation;

public class StringConcatenation {
    public static void main(String[] args) {
        String s="Rand"+" Nassar";
        System.out.println(s);//Rand Nassar

        String s2=50+30+"Rand"+40+40;
        System.out.println(s2);//80Sachin4040

        String s3="Rand ";
        String s4="Nassar";
        String s5=s3.concat(s4);
        System.out.println(s5);
    }
}
