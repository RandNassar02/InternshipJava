package milestone1.javastring.stringmethods.stringcharat;

import java.util.ArrayList;

public class NumberOfVowelsCharAt {
    //        Counting the Number of Vowels in a String by Using the chatAt() Method
            ArrayList<Character> al;

    NumberOfVowelsCharAt(){
        al = new ArrayList<Character>();
        al.add('A'); al.add('E');
        al.add('a'); al.add('e');
        al.add('I'); al.add('O');
        al.add('i'); al.add('o');
        al.add('U'); al.add('u');
    }

    private boolean isVowel (char ch){
        for(int i=0; i<al.size(); i++){
            if(ch==al.get(i)){
                return true;
            }
        }
        return false;
    }

    public int countVowels (String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfVowelsCharAt c = new NumberOfVowelsCharAt();
        String str="java java java ";
        System.out.println(str);
        System.out.println("Total number of vowels: " + c.countVowels(str));
    }
}
