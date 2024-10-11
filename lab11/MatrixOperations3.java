import java.util.Random;

// Matrix class with methods for various operations
class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    // Constructor to initialize matrix size and populate it with random values
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
        Random rand = new Random();

        // Fill the matrix with random numbers between 1 and 100
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(100) + 1;
            }
        }
    }

    // Method to display the matrix
    public synchronized void displayMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display the transpose of the matrix
    public synchronized void displayTranspose() {
        System.out.println("Transpose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }
    }

    // Method to find and display the maximum value in the matrix
    public synchronized void displayMaxValue() {
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum Value: " + max);
    }

    // Method to display the principal diagonal elements
    public synchronized void displayDiagonal() {
        System.out.println("Principal Diagonal Elements:");
        for (int i = 0; i < Math.min(rows, cols); i++) {
            System.out.print(matrix[i][i] + "\t");
        }
        System.out.println();
    }

    // Method to display non-diagonal elements
    public synchronized void displayNonDiagonal() {
        System.out.println("Non-Diagonal Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i != j) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
        }
        System.out.println();
    }
}

// Thread class for each task
class DisplayMatrixThread extends Thread {
    private Matrix matrix;

    public DisplayMatrixThread(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        matrix.displayMatrix();
    }
}

class TransposeMatrixThread extends Thread {
    private Matrix matrix;

    public TransposeMatrixThread(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        matrix.displayTranspose();
    }
}

class MaxValueThread extends Thread {
    private Matrix matrix;

    public MaxValueThread(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        matrix.displayMaxValue();
    }
}

class DiagonalElementsThread extends Thread {
    private Matrix matrix;

    public DiagonalElementsThread(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        matrix.displayDiagonal();
    }
}

class NonDiagonalElementsThread extends Thread {
    private Matrix matrix;

    public NonDiagonalElementsThread(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        matrix.displayNonDiagonal();
    }
}

public class MatrixOperations3 {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(4, 4);  // Create a 4x4 matrix

        // Create threads for various operations
        DisplayMatrixThread t1 = new DisplayMatrixThread(matrix);
        TransposeMatrixThread t2 = new TransposeMatrixThread(matrix);
        MaxValueThread t3 = new MaxValueThread(matrix);
        DiagonalElementsThread t4 = new DiagonalElementsThread(matrix);
        NonDiagonalElementsThread t5 = new NonDiagonalElementsThread(matrix);

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Checking thread status using isAlive() and ensuring that the main thread waits using join()
        try {
            // Waiting for t1 to finish and checking if it is alive
            t1.join();
            System.out.println("t1 isAlive: " + t1.isAlive());

            // Waiting for t2 to finish and checking if it is alive
            t2.join();
            System.out.println("t2 isAlive: " + t2.isAlive());

            // Waiting for t3 to finish and checking if it is alive
            t3.join();
            System.out.println("t3 isAlive: " + t3.isAlive());

            // Waiting for t4 to finish and checking if it is alive
            t4.join();
            System.out.println("t4 isAlive: " + t4.isAlive());

            // Waiting for t5 to finish and checking if it is alive
            t5.join();
            System.out.println("t5 isAlive: " + t5.isAlive());

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
