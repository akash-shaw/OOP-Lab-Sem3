import java.util.Scanner;

public class ArrayOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define an array with a fixed size
        int[] numbers = new int[5]; // Array size is 5, valid indices are 0 to 4

        System.out.println("Please enter 6 numbers (array size is 5):");

        try {
            // Attempt to read 6 numbers, which will cause an ArrayIndexOutOfBoundsException
            for (int i = 0; i < 6; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception if the index goes beyond the array's bounds
            System.out.println("Error: Array overflow. You are trying to access an index beyond the array size.");
        } finally {
            // Always close the scanner
            scanner.close();
        }

        // Optionally, print the valid elements entered so far, if any
        System.out.println("Valid elements entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}
