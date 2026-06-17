import java.util.Scanner;

public class TrimStringComparison {

    static int[] trimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < text.length()
                && text.charAt(start) == ' ')
            start++;

        while (end >= 0
                && text.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    static String substring(String text,
                            int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++)
            result += text.charAt(i);

        return result;
    }

    static boolean compare(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] pos = trimIndexes(text);

        String custom =
                substring(text, pos[0], pos[1]);

        String builtIn = text.trim();

        System.out.println("Custom : " + custom);
        System.out.println("Built-in : " + builtIn);
        System.out.println("Equal : "
                + compare(custom, builtIn));
    }
}