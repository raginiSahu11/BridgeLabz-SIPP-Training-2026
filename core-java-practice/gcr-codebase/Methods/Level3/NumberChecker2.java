import java.util.Scanner;

public class NumberChecker2 {

    public static int[] getDigits(int n) {

        String str = String.valueOf(n);
        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++)
            digits[i] = str.charAt(i) - '0';

        return digits;
    }

    public static int sumDigits(int[] digits) {

        int sum = 0;

        for (int digit : digits)
            sum += digit;

        return sum;
    }

    public static double sumSquares(int[] digits) {

        double sum = 0;

        for (int digit : digits)
            sum += Math.pow(digit, 2);

        return sum;
    }

    public static boolean isHarshad(int n, int[] digits) {
        return n % sumDigits(digits) == 0;
    }

    public static int[][] frequency(int[] digits) {

        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++)
            freq[i][0] = i;

        for (int digit : digits)
            freq[digit][1]++;

        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Sum Digits = " + sumDigits(digits));
        System.out.println("Sum Squares = " + sumSquares(digits));
        System.out.println("Harshad Number = " + isHarshad(n, digits));

        int[][] freq = frequency(digits);

        System.out.println("Digit\tFrequency");

        for (int i = 0; i < 10; i++) {
            System.out.println(freq[i][0] + "\t" + freq[i][1]);
        }
    }
}