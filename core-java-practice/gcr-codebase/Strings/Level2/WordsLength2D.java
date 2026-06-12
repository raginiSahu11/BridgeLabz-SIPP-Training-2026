import java.util.Scanner;

public class WordsLength2D {

    static String[] splitWords(String text) {
        return text.split(" ");
    }

    static int findLength(String word) {

        int count = 0;

        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    static String[][] getWordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] =
                    String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = getWordLength(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t" +
                            Integer.parseInt(result[i][1]));
        }
    }
}