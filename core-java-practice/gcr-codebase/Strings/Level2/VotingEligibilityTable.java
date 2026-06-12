import java.util.Scanner;

public class VotingEligibilityTable {

    static int[] getAges(int n, Scanner sc) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Age " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    static String[][] votingStatus(int[] ages) {

        String[][] data = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            data[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18)
                data[i][1] = "Can Vote";
            else
                data[i][1] = "Cannot Vote";
        }

        return data;
    }

    static void display(String[][] data) {

        System.out.println("Age\tStatus");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0]
                    + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] result =
                votingStatus(getAges(10, sc));

        display(result);
    }
}