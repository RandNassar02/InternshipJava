package milestone1.javaregex;

import java.util.regex.Pattern;

public class RegexMetacharacters {
    public static void main (String[] args){
        System.out.println("Any character (may or may not match terminator)");

        System.out.println("Any digits, short of [0-9]");
        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)

        System.out.println("Any non-digit, short for [^0-9]");
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)
        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)

        System.out.println("Any whitespace character, short for [\\t\\n\\x0B\\f\\r]");
        System.out.println(Pattern.matches("\\s", "abc"));    // false (non-whitespace)
        System.out.println(Pattern.matches("\\s", " "));      // true (single whitespace)
        System.out.println(Pattern.matches("\\s", "   "));    // false (multiple whitespaces)
        System.out.println(Pattern.matches("\\s", "a b"));    // false (whitespace and characters)

        System.out.println("Any non-whitespace character, short for [^\\s]");
        System.out.println(Pattern.matches("\\S", "abc"));    // false (more than one non-whitespace character)
        System.out.println(Pattern.matches("\\S", "a"));      // true (single non-whitespace character)
        System.out.println(Pattern.matches("\\S", " "));      // false (whitespace character)
        System.out.println(Pattern.matches("\\S", "a b"));    // false (contains whitespace)

        System.out.println("Any word character, short for [a-zA-Z_0-9]");
        System.out.println(Pattern.matches("\\w", "a"));      // true (single word character)
        System.out.println(Pattern.matches("\\w", "1"));      // true (single digit)
        System.out.println(Pattern.matches("\\w", "_"));      // true (underscore)
        System.out.println(Pattern.matches("\\w", "abc"));    // false (more than one word character)
        System.out.println(Pattern.matches("\\w", "a1_"));    // false (more than one word character)
        System.out.println(Pattern.matches("\\w", " "));      // false (whitespace character)

        System.out.println("Any non-word character, short for [^\\w]");
        System.out.println(Pattern.matches("\\W", "a"));      // false (word character)
        System.out.println(Pattern.matches("\\W", "1"));      // false (digit)
        System.out.println(Pattern.matches("\\W", "_"));      // false (underscore)
        System.out.println(Pattern.matches("\\W", "!"));      // true (non-word character)
        System.out.println(Pattern.matches("\\W", " "));      // true (whitespace character)
        System.out.println(Pattern.matches("\\W", "abc!"));   // false (more than one character)

        System.out.println("A word boundary");
        System.out.println(Pattern.matches("\\brand\\b", "rand")); // true (exact match)
        System.out.println(Pattern.matches("\\brand\\b", "rand123")); // false (not a word boundary after 'word')
        System.out.println(Pattern.matches("\\brand\\b", "123rand")); // false (not a word boundary before 'word')
        System.out.println(Pattern.matches("\\brand\\b", "123 rand 123")); // true (word boundary on both sides)

        System.out.println("A non word boundary");
        System.out.println(Pattern.matches("\\Brand\\B", "rand")); // false (word boundaries on both sides)
        // the output mast be ture
        System.out.println(Pattern.matches("\\Bword\\B", "swordfish")); // true (non-word boundaries on both sides)
        System.out.println(Pattern.matches("\\Bword\\B", "password")); // true (non-word boundary before and after 'rand')
        System.out.println(Pattern.matches("\\Bword\\B", "swordfishpassword")); // true (non-word boundary before and after 'word')


        System.out.println("A word boundary");
        System.out.println(Pattern.matches("\\bword\\b", "rand")); // false (word boundary missing before 'word')
        System.out.println(Pattern.matches("\\bword\\b", "swordfish")); // false (word boundary missing after 'word')
        System.out.println(Pattern.matches("\\bword\\b", "password")); // false (word boundary missing after 'word')
        System.out.println(Pattern.matches("\\bword\\b", "swordfishpassword")); // false (word boundary missing before and after 'word')

        System.out.println("A non word boundary");
        System.out.println(Pattern.matches("\\Bword\\B", "swordfish")); // true (non-word boundaries on both sides)
        System.out.println(Pattern.matches("\\Bword\\B", "password")); // true (non-word boundary before and after 'word')
        System.out.println(Pattern.matches("\\Bword\\B", "swordfishpassword")); // true (non-word boundary before and after 'word')


    }
}
