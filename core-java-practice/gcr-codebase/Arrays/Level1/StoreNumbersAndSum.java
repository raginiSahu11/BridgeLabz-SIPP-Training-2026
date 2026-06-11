import java.util.Scanner;

public class StoreNumbersAndSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0;
        int index = 0;

        while(true) {

            double value = input.nextDouble();

            if(value <= 0 || index == 10)
                break;

            numbers[index] = value;
            index++;
        }

        System.out.println("Numbers Entered:");

        for(int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Total Sum = " + total);
    }
}