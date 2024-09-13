package milestone1.javaregex;

import java.util.regex.Pattern;

public class RegexCharacter {
    public static void main(String[] args) {
        System.out.println("a, b, or c (simple class)");
        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)

        System.out.println("Any character except a, b, or c (negation)");
        System.out.println(Pattern.matches("[^abc]", "d")); // true (d is not a, b, or c)
        System.out.println(Pattern.matches("[^abc]", "a")); // false (A is in the set [a, b, c])
        System.out.println(Pattern.matches("[^abc]", "ammmna")); // false (a comes more than once)

        System.out.println("a through z or A through Z, inclusive (range)");
        System.out.println(Pattern.matches("[a-zA-Z]", "A")); // true (A is a letter)
        System.out.println(Pattern.matches("[a-zA-Z]", "z")); // true (z is a letter)
        System.out.println(Pattern.matches("[a-zA-Z]", "1")); // false (1 is not a letter)
        System.out.println(Pattern.matches("[a-zA-Z]", "abc")); // false (more than one character)

        System.out.println("a through d, or m through p: [a-dm-p] (union)");
        System.out.println(Pattern.matches("[a-d[m-p]]", "a")); // true (A is in the range a-d)
        System.out.println(Pattern.matches("[a-d[m-p]]", "m")); // true (m is in the range m-p)
        System.out.println(Pattern.matches("[a-d[m-p]]", "e")); // false (e is not in the range a-d or m-p)
        System.out.println(Pattern.matches("[a-d[m-p]]", "z")); // false (z is not in the range a-d or m-p)

        System.out.println("d, e, or f (intersection)");
        System.out.println(Pattern.matches("[a-z&&[def]]", "d")); // true (d is in the set [d, e, f])
        System.out.println(Pattern.matches("[a-z&&[def]]", "e")); // true (e is in the set [d, e, f])
        System.out.println(Pattern.matches("[a-z&&[def]]", "f")); // true (f is in the set [d, e, f])
        System.out.println(Pattern.matches("[a-z&&[def]]", "a")); // false (A is not in the set [d, e, f])
        System.out.println(Pattern.matches("[a-z&&[def]]", "g")); // false (g is not in the set [d, e, f])

        System.out.println("a through z, except for b and c: [ad-z] (subtraction)");
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "a")); // true (A is in the range a-z and not b or c)
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "b")); // false (b is excluded)
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "c")); // false (c is excluded)
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "d")); // true (d is in the range a-z and not b or c)

        System.out.println("a through z, and not m through p: [a-lq-z](subtraction)");
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "a")); // true (A is in the range a-z and not m-p)
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "m")); // false (m is excluded)
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "n")); // false (n is excluded)
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "z")); // true (z is in the range a-z and not m-p)

    }
}
