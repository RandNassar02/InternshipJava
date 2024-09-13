package milestone1.javastring.stringmethods.stringsplit;

public class SplitExample {
    public static void main(String[] args) {
        String str1 = "java string split method by javatpoint";
        String[] words=str1.split("\\s");//splits the string based on whitespace

        for(String word:words){
            if (word.equals("split"))
                System.out.println(word);
        }

    }
}
