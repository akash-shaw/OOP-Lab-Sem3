// package lab5;

import java.util.Scanner;

class Time {
    private int hour, min, sec;

    Time() {
        hour = min = sec = 0;
    }

    Time(int h, int m, int s) {
        hour = h;
        min = m;
        sec = s;
    }

    void display() {
        System.out.print(hour + ":" + min + ":" + sec);
    }

    void add(Time t1, Time t2) {
        sec = (t1.sec + t2.sec) % 60;
        min = (t1.min + t2.min + (t1.sec + t2.sec) / 60) % 60;
        hour = t1.hour + t2.hour + (t1.min + t2.min + (t1.sec + t2.sec) / 60) / 60;
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours, mins, secs: ");
        int hour, min, sec;
        hour = sc.nextInt();
        min = sc.nextInt();
        sec = sc.nextInt();
        Time t1 = new Time(hour, min, sec);
        System.out.print("Enter hours, mins, secs: ");
        hour = sc.nextInt();
        min = sc.nextInt();
        sec = sc.nextInt();
        Time t2 = new Time(hour, min, sec);
        t1.display();
        System.out.print(" + ");
        t2.display();
        System.out.print(" = ");
        Time t3 = new Time();
        t3.add(t1, t2);
        t3.display();
        sc.close();
    }

}
