import java.util.Scanner;

public class KingdomTaxSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTaxCollected = 0;

        for (int i = 0; i < incomes.length; i++) {

            System.out.print("Enter income of Citizen "
                    + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();
        }

        System.out.println("\n--- Tax Report ---");

        for (int i = 0; i < incomes.length; i++) {

            double income = incomes[i];
            double taxRate;
            String bracket;

            if (income < 10000) {
                taxRate = 0.05;
                bracket = "5% Tax Bracket";
            }
            else if (income <= 50000) {
                taxRate = 0.15;
                bracket = "15% Tax Bracket";
            }
            else {
                taxRate = 0.30;
                bracket = "30% Tax Bracket";
            }

            double taxAmount = income * taxRate;
            totalTaxCollected += taxAmount;

            System.out.println(
                    "Citizen " + (i + 1) +
                            " | Income: " + income +
                            " | Bracket: " + bracket +
                            " | Tax: " + taxAmount
            );
        }

        System.out.println("\nTotal Tax Collected = "
                + totalTaxCollected);

        sc.close();
    }
}