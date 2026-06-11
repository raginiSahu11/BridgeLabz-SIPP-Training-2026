import java.util.Scanner;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int[] result = new int[4];

        for(int i = 6; i <= 9; i++) {
            result[i - 6] = number * i;
        }

        for(int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[i - 6]);
        }
    }
}