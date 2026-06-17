import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1
    public static boolean palindromeLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    // Logic 2
    public static boolean palindromeRecursive(String text,
                                              int start,
                                              int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return palindromeRecursive(text, start + 1, end - 1);
    }

    // Reverse String
    public static char[] reverse(String text) {

        char[] rev = new char[text.length()];

        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            rev[index++] = text.charAt(i);
        }

        return rev;
    }

    // Logic 3
    public static boolean palindromeArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverse(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        System.out.println("Loop Method: "
                + palindromeLoop(text));

        System.out.println("Recursive Method: "
                + palindromeRecursive(text, 0,
                text.length() - 1));

        System.out.println("Array Method: "
                + palindromeArray(text));

        sc.close();
    }
}