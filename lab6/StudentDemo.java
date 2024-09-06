// Base class for Student
class Student {
    protected String regNumber, name;
    protected int age, semester;
    protected double fees;

    // Constructor
    public Student(String regNumber, String name, int age, int semester, double fees) {
        this.regNumber = regNumber;
        this.name = name;
        this.age = age;
        this.semester = semester;
        this.fees = fees;
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

// Derived class for UG Student
class UGStudent extends Student {
    private static int UGAdmissionCount = 0;

    // Constructor
    public UGStudent(String regNumber, String name, int age, int semester, double fees) {
        super(regNumber, name, age, semester, fees);  // Call base class constructor
        UGAdmissionCount++;  // Increment UG student count
    }

    // Static method to get UG admission count
    public static int getUGAdmissionCount() {
        return UGAdmissionCount;
    }
}

// Derived class for PG Student
class PGStudent extends Student {
    private static int PGAdmissionCount = 0;

    // Constructor
    public PGStudent(String regNumber, String name, int age, int semester, double fees) {
        super(regNumber, name, age, semester, fees);  // Call base class constructor
        PGAdmissionCount++;  // Increment PG student count
    }

    // Static method to get PG admission count
    public static int getPGAdmissionCount() {
        return PGAdmissionCount;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create UG and PG students
        UGStudent ug1 = new UGStudent("UG101", "Alice", 18, 1, 50000);
        UGStudent ug2 = new UGStudent("UG102", "Bob", 19, 2, 55000);

        PGStudent pg1 = new PGStudent("PG201", "Charlie", 22, 1, 70000);
        PGStudent pg2 = new PGStudent("PG202", "David", 23, 2, 75000);

        // Display UG students
        System.out.println("UG Students:");
        ug1.displayStudentDetails();
        ug2.displayStudentDetails();
        System.out.println();

        // Display PG students
        System.out.println("PG Students:");
        pg1.displayStudentDetails();
        pg2.displayStudentDetails();
        System.out.println();

        // Display total UG and PG admissions
        System.out.println("Total UG Admissions: " + UGStudent.getUGAdmissionCount());
        System.out.println("Total PG Admissions: " + PGStudent.getPGAdmissionCount());
    }
}


/* Output
UG Students:
Registration Number: UG101
Name: Alice
Age: 18
Semester: 1
Fees: 50000.0

Registration Number: UG102
Name: Bob
Age: 19
Semester: 2
Fees: 55000.0

PG Students:
Registration Number: PG201
Name: Charlie
Age: 22
Semester: 1
Fees: 70000.0

Registration Number: PG202
Name: David
Age: 23
Semester: 2
Fees: 75000.0

Total UG Admissions: 2
Total PG Admissions: 2
*/
