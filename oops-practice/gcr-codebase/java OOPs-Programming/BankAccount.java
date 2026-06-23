class BankAccount {
    private int accountNumber;
    private String holder;
    private double balance;

    static int totalAccounts = 0;

    BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void getStatement() {
        System.out.println(accountNumber + " | " + holder + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(101, "Ragini", 10000);
        BankAccount a2 = new BankAccount(102, "Aman", 8000);
        BankAccount a3 = new BankAccount(103, "Priya", 12000);

        a1.deposit(500);
        a1.withdraw(1000);
        a1.deposit(200);
        a1.withdraw(300);
        a1.deposit(100);

        a2.deposit(1000);
        a2.withdraw(500);
        a2.deposit(700);
        a2.withdraw(200);
        a2.deposit(300);

        a3.deposit(2000);
        a3.withdraw(1500);
        a3.deposit(500);
        a3.withdraw(700);
        a3.deposit(1000);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("Total Accounts: " + totalAccounts);
    }
}