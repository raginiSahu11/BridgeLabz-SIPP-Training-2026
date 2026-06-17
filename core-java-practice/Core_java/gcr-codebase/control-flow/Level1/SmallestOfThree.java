import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        boolean result = (n1 < n2 && n1 < n3);

        System.out.println("Is the first number the smallest? " + result);
    }
}