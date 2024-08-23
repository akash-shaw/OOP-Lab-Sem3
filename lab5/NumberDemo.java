import java.util.Scanner;

class Number{
    private double num;

    Number(){
        num = 0;
    }
    Number(double n){
        num = n;
    }

    boolean isZero(){
        return num==0;
    }
    boolean isNegative(){
        return num<0;
    }
    boolean isOdd(){
        return num%2==1;
    }
    boolean isEven(){
        return num%2==0;
    }
    boolean isPrime(){
        for(int i =2; i<num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    boolean isArmstrong(){
        int n= (int)num, arm=0;
        while (n!=0) {
            int d = n%10;
            arm = arm + d*d*d;
            n=n/10;
        }
        return (int)num==arm;
    }
}

public class NumberDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num = sc.nextDouble();

        Number n = new Number(num);
        System.out.println("isZero = " + n.isZero());
        System.out.println("isNegative = " + n.isNegative());
        System.out.println("isOdd = " + n.isOdd());
        System.out.println("isEven = " + n.isEven());
        System.out.println("isPrime = " + n.isPrime());
        System.out.println("isArmstrong = " + n.isArmstrong());

        sc.close();
    }
}