package milestone1.javastring.stringmethods.stringsubstring;

public class SubstringExample3 {
    public boolean isPalindrome(String str) {
        int size = str.length();

        if (size == 0 || size == 1) {
            return true;
        }

        String f = str.substring(0, 1);
        String l = str.substring(size - 1);

        if (l.equals(f)) {
            // recursively finding the solution using the substring() method
            // reducing the number of characters of the by 2 for the next recursion
            return isPalindrome(str.substring(1, size - 1));
        }
        return false;
    }

    public static void main(String[] args) {
// instantiating the class SubstringExample4
        SubstringExample3 obj = new SubstringExample3();
        String str[] =
                {
                        "madam",
                        "rock",
                        "eye",
                        "noon",
                        "kill"
                };
        int size = str.length;

        for (int j = 0; j < size; j++) {
            if (obj.isPalindrome(str[j])) {
                System.out.println(str[j] + " is a palindrome.");
            } else {
                System.out.println(str[j] + " is not a palindrome.");
            }
        }
    }
}