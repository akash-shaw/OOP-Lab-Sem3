import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        String input = scanner.nextLine();

        try {
            // Attempt to convert the input string to an integer
            int number = Integer.parseInt(input);
            System.out.println("You entered the number: " + number);
        } catch (NumberFormatException e) {
            // Catch the exception if the input is not a valid integer
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
