import java.util.Scanner;

public class countString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        analyzeText(input);

        sc.close();
    }

    private static void analyzeText(String text) {
        int characterCount = text.length();
        int wordCount = text.split("\\s+").length;
        int lineCount = text.split("\n").length;
        int vowelCount = countVowels(text);

        System.out.println("Character count: " + characterCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
        System.out.println("Vowel count: " + vowelCount);
    }

    private static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : text.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}



