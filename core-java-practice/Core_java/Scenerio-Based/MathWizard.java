class MathWizard {

    int instanceVar;

    // Constructor
    MathWizard() {
        instanceVar = 100;
    }

    // Touch method
    public void touch() {
        System.out.println("MathWizard is active!");
    }

    // Other methods...
    public boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }
}