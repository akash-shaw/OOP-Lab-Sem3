import java.util.Scanner;

public class wordReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Word to replace: ");
        String toReplace = sc.nextLine();

        System.out.println("Replace with: ");
        String replacement = sc.nextLine();

        System.out.println("New String: " + str.replace(toReplace, replacement));

        sc.close();
    }
}
