import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] > 0) {
                if(numbers[i] % 2 == 0)
                    System.out.println(numbers[i] + " is Positive Even");
                else
                    System.out.println(numbers[i] + " is Positive Odd");
            }
            else if(numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            }
            else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        if(numbers[0] == numbers[4])
            System.out.println("First and Last elements are Equal");
        else if(numbers[0] > numbers[4])
            System.out.println("First element is Greater");
        else
            System.out.println("First element is Less");
    }
}