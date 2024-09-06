// package lab7;

import java.util.*;

class Counter {
    public static int count = 0;

    Counter() {
        System.out.println("Object Created");
        count++;
    }
}

public class counterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Counter> objects = new ArrayList<>();
        while (true) {
            System.out.println("1. Create Object");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    objects.add(new Counter());
                    break;
                case 2:
                    System.out.println("Number of objects = " + Counter.count);
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}



/* Output
1. Create Object
2. Exit
Choice: 1
Object Created
1. Create Object
2. Exit
Choice: 1
Object Created
1. Create Object
2. Exit
Choice: 1
Object Created
1. Create Object
2. Exit
Choice: 2
Number of objects = 3
*/