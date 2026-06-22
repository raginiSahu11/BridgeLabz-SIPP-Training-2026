public class BankDemo {

    public static void main(String[] args) {

        BankAccount acc1 =
                new BankAccount(101, "Pranjal", 10000);

        BankAccount acc2 =
                new BankAccount(102, "Rahul", 15000);

        BankAccount acc3 =
                new BankAccount(103, "Ankit", 20000);

        // Account 1 - 5 Transactions
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(12000);

        // Account 2 - 5 Transactions
        acc2.deposit(4000);
        acc2.withdraw(2000);
        acc2.deposit(1000);
        acc2.withdraw(5000);
        acc2.withdraw(3000);

        // Account 3 - 5 Transactions
        acc3.deposit(3000);
        acc3.withdraw(2500);
        acc3.deposit(1500);
        acc3.withdraw(10000);
        acc3.withdraw(5000);

        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        System.out.println("\nTotal Accounts Created: "
                + BankAccount.getTotalAccounts());
    }
}