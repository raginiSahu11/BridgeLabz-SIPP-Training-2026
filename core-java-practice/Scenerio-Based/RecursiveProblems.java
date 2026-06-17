class RecursiveProblems {

    // Counter for Tower of Hanoi moves
    int moveCount = 0;

    // 1. Tower of Hanoi
    public void towerOfHanoi(int n, char source, char auxiliary, char destination) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveCount++;

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    // 2. Recursive Binary Search
    public int binarySearch(int[] arr, int low, int high, int target) {

        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target)
            return mid;

        if (target < arr[mid])
            return binarySearch(arr, low, mid - 1, target);

        return binarySearch(arr, mid + 1, high, target);
    }

    // 3. Sum of Digits
    public int sumOfDigits(int n) {

        if (n == 0)
            return 0;

        return (n % 10) + sumOfDigits(n / 10);
    }

    // 4. Reverse String
    public String reverseString(String str) {

        if (str.length() <= 1)
            return str;

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // 5. Balanced Parentheses (No Stack)
    public boolean isBalanced(String str) {
        return checkBalance(str, 0, 0);
    }

    private boolean checkBalance(String str, int index, int count) {

        if (count < 0)
            return false;

        if (index == str.length())
            return count == 0;

        char ch = str.charAt(index);

        if (ch == '(')
            return checkBalance(str, index + 1, count + 1);

        if (ch == ')')
            return checkBalance(str, index + 1, count - 1);

        return checkBalance(str, index + 1, count);
    }
}

public class Main {

    public static void main(String[] args) {

        RecursiveProblems rp = new RecursiveProblems();

        // Tower of Hanoi
        int n = 3;

        System.out.println("Tower of Hanoi:");
        rp.towerOfHanoi(n, 'A', 'B', 'C');

        System.out.println("Total Moves = " + rp.moveCount);

        // Binary Search
        int[] prices = {100, 200, 300, 400, 500, 600};

        int target = 400;

        int index = rp.binarySearch(prices, 0, prices.length - 1, target);

        System.out.println("\nBinary Search:");
        System.out.println("Price found at index = " + index);

        // Sum of Digits
        int number = 12345;

        System.out.println("\nSum of Digits:");
        System.out.println(rp.sumOfDigits(number));

        // Reverse String
        String text = "Temple";

        System.out.println("\nReverse String:");
        System.out.println(rp.reverseString(text));

        // Balanced Parentheses
        String exp = "((()))";

        System.out.println("\nBalanced Parentheses:");
        System.out.println(rp.isBalanced(exp));
    }
}