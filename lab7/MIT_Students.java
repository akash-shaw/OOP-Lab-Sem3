// package lab7;
import java.util.*;

class Student_Detail{
    private String name;
    private int id;
    private String college_name;

    Student_Detail(String name, int id, String college_name){
        this.name = name;
        this.id = id;
        this.college_name = college_name;
    }

    public void display_details(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("College Name: "+college_name);
    }
}

public class MIT_Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name, college_name;
        int id;

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();

        // Student_Detail MIT[] = new Student_Detail[n];
        List<Student_Detail> MIT = new ArrayList<>();

        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1));
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("ID: ");
            id = sc.nextInt();
            // sc.nextLine();
            System.out.print("College Name: ");
            college_name = sc.nextLine();

            if(college_name.equalsIgnoreCase("MIT")){
                MIT.add(new Student_Detail(name, id, college_name));
            }

        }

        System.out.println("\nStudents in MIT:");
        for(Student_Detail student : MIT){
            student.display_details();
            System.out.println();
        }
    }
}


/*

Enter number of students: 3
Student 1
Name: a
ID: 1
College Name: mit
Student 2
Name: b
ID: 2
College Name: mic
Student 3
Name: c
ID: 34
College Name: mit

Students in MIT:
Name: a
ID: 1
College Name: mit

Name: c
ID: 34
College Name: mit

 */