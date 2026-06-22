public class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;

    static int totalAccounts = 0;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Rs." + amount +
                " into Account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal Failed! Insufficient Balance in Account "
                    + accountNumber);
        } else {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount +
                    " from Account " + accountNumber);
        }
    }

    public void getStatement() {
        System.out.println("\n----- Account Statement -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : Rs." + balance);
        System.out.println("-----------------------------");
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}