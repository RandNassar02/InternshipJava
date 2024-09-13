package milestone1.javastring.stringmethods.stringlength;

public class LengthExample4 {
    public static void main(String[] args) {
        String str = " Welcome To JavaTpoint ";

        int sizeWithWhiteSpaces=str.length();
        System.out.println("In the string: "+str);
        System.out.println("sizeWithWhiteSpaces"+sizeWithWhiteSpaces);

        str=str.replace(" ","");
        int sizeWithoutWhiteSpaces=str.length();
        System.out.println("In the string: "+str);
        System.out.println("sizeWithoutWhiteSpaces"+sizeWithoutWhiteSpaces);

        int oOfWhieSpaces =sizeWithWhiteSpaces - sizeWithoutWhiteSpaces;
        System.out.println("Total length: "+oOfWhieSpaces);
    }
}
