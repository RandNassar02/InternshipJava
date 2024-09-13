package milestone3.collections.stack;

import java.util.Stack;

public class SearchMethodExample {
    public static void main(String[] args) {
        Stack<String> stk= new Stack<>();
//pushing elements into Stack
        stk.push("Mac Book");
        stk.push("HP");
        stk.push("DELL");
        stk.push("Asus");
        System.out.println("Stack: " + stk);
// Search an element
        int location = stk.search("DELL");
        System.out.println("Location of Dell: " + location);
    }
}
