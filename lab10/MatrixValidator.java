import java.util.Scanner;

// Step 1: Define a custom exception for non-square matrix
class NonSquareMatrixException extends Exception {
    public NonSquareMatrixException(String message) {
        super(message);  // Pass the message to the Exception constructor
    }
}

public class MatrixValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Step 2: Input matrix dimensions
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            System.out.print("Enter the number of columns: ");
            int cols = scanner.nextInt();

            // Step 3: Check if the matrix is square
            if (rows != cols) {
                throw new NonSquareMatrixException("Error: Matrix is not square. Number of rows and columns must be equal.");
            }

            // Step 4: Input the matrix elements
            int[][] matrix = new int[rows][cols];
            System.out.println("Enter the elements of the matrix:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter element at [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Step 5: Display the matrix
            System.out.println("Matrix entered:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        } catch (NonSquareMatrixException e) {
            // Handle the custom exception
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Catch any other exception
            System.out.println("Error: Invalid input.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
