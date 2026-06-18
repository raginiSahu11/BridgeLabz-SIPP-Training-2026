import java.util.Scanner;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    // Method to calculate average cost per item
    public static double calculateBill(double totalBill, int items) {
        return totalBill / items;
    }

    // Method to process payment
    public static void processPayment(double billAmount, double payment)
            throws InsufficientFundsException {

        if (payment < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds. Required ₹"
                            + billAmount + ", but paid ₹" + payment);
        }

        System.out.println("Payment successful!");
        System.out.println("Change returned: ₹" + (payment - billAmount));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] patients = {"Riya", "Aman", "Neha", "Rahul"};

        try {
            // Array Index Out of Bounds Handling
            System.out.print("Enter patient index (0-3): ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient Name: " + patients[index]);

            // Number Format Exception Handling
            System.out.print("Enter total bill amount: ");
            double totalBill = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of items/services: ");
            int items = Integer.parseInt(sc.nextLine());

            // Division by Zero Handling
            double averageCost = calculateBill(totalBill, items);
            System.out.println("Average cost per item: ₹" + averageCost);

            // Payment Processing
            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            processPayment(totalBill, payment);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index! Please select a valid patient.");

        } catch (ArithmeticException e) {
            System.out.println("Number of items cannot be zero. Division by zero is not allowed.");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());

        } finally {
            System.out.println("Hospital billing process completed.");
            sc.close();
        }
    }
}