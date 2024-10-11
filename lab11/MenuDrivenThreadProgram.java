import java.util.Scanner;

// 1. Using the Runnable interface to create a thread
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread - Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

// 2. Using the Thread class (extending Thread) to create a thread
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class - Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class MenuDrivenThreadProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Thread using Runnable interface");
            System.out.println("2. Create Thread by extending Thread class");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create and start a thread using Runnable interface
                    MyRunnable runnableTask = new MyRunnable();
                    Thread runnableThread = new Thread(runnableTask);
                    runnableThread.start();
                    try {
                        runnableThread.join(); // Wait for the thread to complete
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted: " + e.getMessage());
                    }
                    break;

                case 2:
                    // Create and start a thread by extending Thread class
                    MyThread threadTask = new MyThread();
                    threadTask.start();
                    try {
                        threadTask.join(); // Wait for the thread to complete
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted: " + e.getMessage());
                    }
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
