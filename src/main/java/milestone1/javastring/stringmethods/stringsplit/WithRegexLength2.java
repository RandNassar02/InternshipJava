package milestone1.javastring.stringmethods.stringsplit;

public class WithRegexLength2 {
    public static void main(String[] args) {
        String str = "Javatpointtt";
        String[] arr = str.split("t", 0);
        for (String w : arr) {
            System.out.println(w);
        }
        System.out.println("Split array length: "+arr.length);
    }
}