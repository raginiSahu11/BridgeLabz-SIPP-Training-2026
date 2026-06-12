import java.util.Scanner;

public class ShortestLongestWord {

    static String[] splitWords(String text) {
        return text.split(" ");
    }

    static String[][] getWordLength(String[] words) {

        String[][] data =
                new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] =
                    String.valueOf(words[i].length());
        }

        return data;
    }

    static int[] shortestLongest(String[][] data) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {

            if (Integer.parseInt(data[i][1])
                    < Integer.parseInt(data[shortest][1])) {
                shortest = i;
            }

            if (Integer.parseInt(data[i][1])
                    > Integer.parseInt(data[longest][1])) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] data = getWordLength(words);

        int[] result = shortestLongest(data);

        System.out.println("Shortest Word = "
                + data[result[0]][0]);

        System.out.println("Longest Word = "
                + data[result[1]][0]);
    }
}