import java.util.Scanner;
class Box {
    private double width, height, depth;
    
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double volume(){
        return width*depth*height;
    }
}

public class BoxDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width, height, depth: ");
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double d = sc.nextDouble();
        Box Mybox = new Box(w,h,d);

        double vol = Mybox.volume();

        System.out.println("Volume = "+vol);

        sc.close();

    }
}