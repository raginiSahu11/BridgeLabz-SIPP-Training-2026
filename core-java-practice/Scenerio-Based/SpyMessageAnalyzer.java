import java.util.*;

public class SpyMessageAnalyzer {

    // Reverse the message
    public static String reverseMessage(String msg) {
        return new StringBuilder(msg).reverse().toString();
    }

    // Check palindrome
    public static boolean isPalindrome(String msg) {
        String cleaned = msg.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Count vowels and consonants
    public static void countVowelsConsonants(String msg) {
        int vowels = 0, consonants = 0;

        msg = msg.toLowerCase();

        for (char ch : msg.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Check anagrams
    public static boolean areAnagrams(String s1, String s2) {
        char[] arr1 = s1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] arr2 = s2.replaceAll("\\s+", "").toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // Find first non-repeating character
    public static Character firstNonRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    public static void main(String[] args) {

        String secretMessage = "Radar";

        System.out.println("Original Message: " + secretMessage);

        // Reverse
        System.out.println("Reversed Message: " +
                reverseMessage(secretMessage));

        // Palindrome Check
        System.out.println("Is Palindrome? " +
                isPalindrome(secretMessage));

        // Vowel & Consonant Count
        countVowelsConsonants(secretMessage);

        // Anagram Check
        String intercept1 = "listen";
        String intercept2 = "silent";

        System.out.println("\nIntercept 1: " + intercept1);
        System.out.println("Intercept 2: " + intercept2);

        System.out.println("Are Anagrams? " +
                areAnagrams(intercept1, intercept2));

        // First Non-Repeating Character
        String surveillanceLog = "swiss";

        Character result = firstNonRepeatingChar(surveillanceLog);

        System.out.println("\nSurveillance Log: " +
                surveillanceLog);

        if (result != null)
            System.out.println("First Non-Repeating Character: " +
                    result);
        else
            System.out.println("No Non-Repeating Character Found");
    }
}