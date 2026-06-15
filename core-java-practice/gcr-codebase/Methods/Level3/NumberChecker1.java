import java.util.Scanner;

public class NumberChecker1 {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String str = String.valueOf(n);
        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++)
            digits[i] = str.charAt(i) - '0';

        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0)
                return true;
        }
        return false;
    }

    public static boolean isArmstrong(int n, int[] digits) {
        int sum = 0;

        for (int digit : digits)
            sum += Math.pow(digit, digits.length);

        return sum == n;
    }

    public static void largestSecondLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }

    public static void smallestSecondSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Second Smallest = " + secondSmallest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Digit Count: " + countDigits(n));
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(n, digits));

        largestSecondLargest(digits);
        smallestSecondSmallest(digits);
    }
}