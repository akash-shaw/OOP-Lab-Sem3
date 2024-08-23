// package lab5;

import java.util.Scanner;

class complex {
    int a,b;

    complex(){
        a=b=0;
    }

    complex(int real){
        a=real;
        b=0;
    }

    complex(int real, int img){
        a = real;
        b = img;
    }

    void add(int n, complex c){
        a = a + n +c.a; 
        b = b + c.b;
    }
    void add(complex c1, complex c2){
        a = a + c1.a + c2.a;
        b = b + c1.b + c2.b;
    }
    void display(){
        System.out.print(a + "+" + b + "i\n");
    }    
}


public class complexDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complex no C1: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        complex c1 = new complex(a,b);
        System.out.print("Enter complex no C1: ");
        a = sc.nextInt();
        b = sc.nextInt();
        complex c2 = new complex(a,b);
        complex c3 = new complex();
        c3.add(c1, c2);
        System.out.print("C1 + C2 = ");
        c3.display();
        System.out.print("Enter complex no c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        complex c = new complex(a,b);
        System.out.print("Enter real number n: ");
        int n = sc.nextInt();
        complex c4 = new complex();
        c4.add(n, c);
        System.out.print("C + n = ");
        c4.display();
        sc.close();
    }
}