// package lab8;

import java.util.Scanner;

interface Figure{
    abstract double calculateArea();
}

class Rectangle implements Figure{
    private int width, breadth;

    Rectangle(int width, int breadth){
        this.width=width;
        this.breadth=breadth;
    }

    public double calculateArea(){
        return (double)width*breadth;
    }
}

class Circle implements Figure{
    private int radius;

    Circle(int radius){
        this.radius=radius;
    }

    public double calculateArea(){
        return (double)Math.PI*radius*radius;
    }
}

public class AreaOfFigureInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Rectangle---");
        System.out.print("Width: ");
        int width = sc.nextInt();
        System.out.print("Breadth: ");
        int breadth = sc.nextInt();

        Figure fig1 =  new Rectangle(width, breadth);

        System.out.println("Area = "+ fig1.calculateArea());

        System.out.println("---Circle---");
        System.out.print("Radius: ");
        int radius = sc.nextInt();

        Figure fig2 = new Circle(radius);
        
        System.out.println("Area = "+ fig2.calculateArea());

        sc.close();
    }
}
