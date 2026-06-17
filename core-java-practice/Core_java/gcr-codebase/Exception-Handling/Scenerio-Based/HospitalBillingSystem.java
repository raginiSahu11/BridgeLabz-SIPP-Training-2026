class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double balance, double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        try {
            int totalBill = 1000;
            int items = 0;

            System.out.println(totalBill / items);

        } catch (ArithmeticException e) {
            System.out.println("Error: Bill contains zero items.");
        }

        try {
            int patients[] = {101, 102, 103};

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            int age = Integer.parseInt("abc");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        try {
            processPayment(500, 1000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}