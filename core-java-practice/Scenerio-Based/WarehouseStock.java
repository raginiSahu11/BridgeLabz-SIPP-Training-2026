import java.util.*;

public class WarehouseStock {

    // Function to rotate array by k positions
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        System.arraycopy(temp, 0, arr, 0, n);
    }

    // Function to transpose a 2D matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void main(String[] args) {

        // Stock quantities
        int[] stock = {50, 20, 70, 50, 90, 20, 40};

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        // Find max, min, total stock, duplicates
        for (int qty : stock) {
            if (qty > max)
                max = qty;

            if (qty < min)
                min = qty;

            total += qty;

            if (!seen.add(qty))
                duplicates.add(qty);
        }

        System.out.println("Stock Array: " + Arrays.toString(stock));
        System.out.println("Maximum Stock = " + max);
        System.out.println("Minimum Stock = " + min);
        System.out.println("Total Stock = " + total);
        System.out.println("Duplicate Quantities = " + duplicates);

        // Rotate array
        int k = 2;
        rotateArray(stock, k);

        System.out.println("\nArray after rotating by " + k + " positions:");
        System.out.println(Arrays.toString(stock));

        // 2D Shelf Grid
        int[][] shelfGrid = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\nOriginal Shelf Grid:");
        for (int[] row : shelfGrid) {
            System.out.println(Arrays.toString(row));
        }

        int[][] transposed = transposeMatrix(shelfGrid);

        System.out.println("\nTransposed Shelf Grid:");
        for (int[] row : transposed) {
            System.out.println(Arrays.toString(row));
        }
    }
}