import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

    public static int[] getDigits(int n) {

        String str = String.valueOf(n);
        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++)
            digits[i] = str.charAt(i) - '0';

        return digits;
    }

    public static int[] reverseArray(int[] arr) {

        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];

        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseArray(digits));
    }

    public static boolean isDuckNumber(int[] digits) {

        for (int digit : digits)
            if (digit == 0)
                return true;

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Palindrome = " + isPalindrome(digits));
        System.out.println("Duck Number = " + isDuckNumber(digits));
    }
}