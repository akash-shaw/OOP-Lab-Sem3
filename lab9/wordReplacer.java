import java.util.Scanner;

public class wordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the original string
        System.out.println("Enter a sentence:");
        String original = scanner.nextLine();

        // Input the word to be replaced
        System.out.println("Enter the word to be replaced:");
        String toReplace = scanner.nextLine();

        // Input the replacement word
        System.out.println("Enter the replacement word:");
        String replacement = scanner.nextLine();

        // Replace the word
        String result = original.replace(toReplace, replacement);

        // Output the result
        System.out.println("Updated sentence:");
        System.out.println(result);

        scanner.close();
    }
}
