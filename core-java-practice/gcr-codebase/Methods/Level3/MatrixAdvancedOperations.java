public class MatrixAdvancedOperations {

    public static int[][] transpose(
            int[][] matrix) {

        int[][] trans =
                new int[matrix[0].length]
                        [matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                trans[j][i] = matrix[i][j];
            }
        }

        return trans;
    }

    public static double determinant2x2(
            int[][] m) {

        return m[0][0] * m[1][1]
                - m[0][1] * m[1][0];
    }

    public static double determinant3x3(
            int[][] m) {

        return m[0][0] *
                (m[1][1]*m[2][2]
                        -m[1][2]*m[2][1])

                - m[0][1] *
                (m[1][0]*m[2][2]
                        -m[1][2]*m[2][0])

                + m[0][2] *
                (m[1][0]*m[2][1]
                        -m[1][1]*m[2][0]);
    }

    public static void display(
            int[][] matrix) {

        for (int[] row : matrix) {

            for (int val : row)
                System.out.print(val + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Matrix");
        display(matrix);

        System.out.println("\nTranspose");
        display(transpose(matrix));

        System.out.println(
                "\nDeterminant 3x3 = "
                        + determinant3x3(matrix));
    }
}