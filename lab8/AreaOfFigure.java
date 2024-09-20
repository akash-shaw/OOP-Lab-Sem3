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

class Triangle extends Figure{
    private int side1, side2, side3;

    Triangle(int side1, int side2,int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double calculateArea(){
        double s = (double)(side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
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

        System.out.println("---Triangle---");
        System.out.print("Side1: ");
        int width = sc.nextInt();
        System.out.print("Breadth: ");
        int breadth = sc.nextInt();

        sc.close();
    }
}
