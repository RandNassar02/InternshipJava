package milestone3.newfeatures.optionalclass;

public class ProgramWithoutUsingOptional {
    public static void main(String[] args) {
        String[] str=new String[10];
        String lowercase=str[5].toLowerCase();
        System.out.println(lowercase);
    }
}


//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "str[5]" is null