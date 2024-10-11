// Step 1: Create a user-defined exception class
class InvalidMarksException extends Exception {
    // Constructor that accepts a message
    public InvalidMarksException(String message) {
        // Pass the message to the superclass constructor
        super(message);
    }
}

import java.util.Scanner;

public class StudentDetailsWithCustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting student details
        System.out.println("Enter student details:");
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Roll Number: ");
        String rollNumber = scanner.nextLine();

        double marks1 = 0, marks2 = 0, marks3 = 0;

        try {
            // Input and validation for marks
            System.out.print("Enter marks in subject 1: ");
            marks1 = Double.parseDouble(scanner.nextLine());
            validateMarks(marks1);

            System.out.print("Enter marks in subject 2: ");
            marks2 = Double.parseDouble(scanner.nextLine());
            validateMarks(marks2);

            System.out.print("Enter marks in subject 3: ");
            marks3 = Double.parseDouble(scanner.nextLine());
            validateMarks(marks3);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid numerical values for marks.");
            return; // Exit the program if input is invalid
        } catch (InvalidMarksException e) {
            // Catch the custom exception
            System.out.println(e.getMessage());
            return; // Exit the program if marks are invalid
        }

        // Calculate the total marks and percentage
        double totalMarks = marks1 + marks2 + marks3;
        double percentage = (totalMarks / 300) * 100;

        // Determine the grade
        String grade = "";
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B+";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Display the student details
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Step 2: Method to validate the marks
    public static void validateMarks(double marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Error: Marks must be between 0 and 100.");
        }
    }
}
