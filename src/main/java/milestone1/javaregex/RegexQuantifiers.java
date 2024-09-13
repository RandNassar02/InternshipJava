package milestone1.javaregex;

import java.util.regex.Pattern;

public class RegexQuantifiers {
    public static void main(String[] args) {
        System.out.println("X occurs once or not at all");
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (A m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)

        System.out.println("X occurs once or more times");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

        System.out.println("X occurs zero or more times");
        System.out.println(Pattern.matches("[amn]*", "a"));       // true (A is in the set [a, m, n])
        System.out.println(Pattern.matches("[amn]*", "aaa"));     // true (all characters are in the set [a, m, n])
        System.out.println(Pattern.matches("[amn]*", "aammmnn"));// true (all characters are in the set [a, m, n])
        System.out.println(Pattern.matches("[amn]*", "aazzta"));  // false (z and t are not in the set [a, m, n])
        System.out.println(Pattern.matches("[amn]*", "am"));      // true (all characters are in the set [a, m, n])

        System.out.println("X occurs n times only");
        System.out.println(Pattern.matches("a{3}", "aaa"));   // true (exactly 3 'a's)
        System.out.println(Pattern.matches("a{3}", "aa"));    // false (only 2 'a's)
        System.out.println(Pattern.matches("a{3}", "aaaa"));  // false (more than 3 'a's)
        System.out.println(Pattern.matches("a{3}", "b"));     // false (no 'a's)


        System.out.println("X occurs n or more times");
        System.out.println(Pattern.matches("a{3,}", "aaa"));   // true (exactly 3 'a's)
        System.out.println(Pattern.matches("a{3,}", "aaaa"));  // true (more than 3 'a's)
        System.out.println(Pattern.matches("a{3,}", "aa"));    // false (less than 3 'a's)
        System.out.println(Pattern.matches("a{3,}", "b"));     // false (no 'a's)


        System.out.println("X occurs at least y times but less than z times");
        System.out.println(Pattern.matches("a{2,4}", "aa"));    // true (exactly 2 'a's)
        System.out.println(Pattern.matches("a{2,4}", "aaa"));   // true (exactly 3 'a's)
        System.out.println(Pattern.matches("a{2,4}", "aaaa"));  // true (exactly 4 'a's)
        System.out.println(Pattern.matches("a{2,4}", "aaaaa")); // false (more than 4 'a's)
        System.out.println(Pattern.matches("a{2,4}", "a"));     // false (less than 2 'a's)
    }
}
