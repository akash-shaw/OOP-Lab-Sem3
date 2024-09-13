// package lab8;

import java.util.Scanner;

abstract class Figure{
    abstract double calculateArea();
}

class Rectangle extends Figure{
    private int width, breadth;

    Rectangle(int width, int breadth){
        this.width=width;
        this.breadth=breadth;
    }

    double calculateArea(){
        return (double)width*breadth;
    }
}

class Circle extends Figure{
    private int radius;

    Circle(int radius){
        this.radius=radius;
    }

    double calculateArea(){
        return (double)Math.PI*radius*radius;
    }
}

public class AreaOfFigure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Rectangle---");
        System.out.print("Width: ");
        int width = sc.nextInt();
        System.out.print("Breadth: ");
        int breadth = sc.nextInt();

        Rectangle fig1 =  new Rectangle(width, breadth);

        System.out.println("Area = "+ fig1.calculateArea());

        System.out.println("---Circle---");
        System.out.print("Radius: ");
        int radius = sc.nextInt();

        Circle fig2 = new Circle(radius);
        
        System.out.println("Area = "+ fig2.calculateArea());

        sc.close();
    }
}
