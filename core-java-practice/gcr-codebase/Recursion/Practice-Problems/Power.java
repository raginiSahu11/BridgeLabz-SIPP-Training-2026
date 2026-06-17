public class Power {

    public static long power(long x, long n) {
        if (n == 0) {
            return 1;
        }

        long half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return half * half * x;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}