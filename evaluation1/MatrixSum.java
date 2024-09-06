// package evaluation1;
import java.util.Scanner;
public class MatrixSum {

    public static boolean isPrime(int num){
        if(num<2)
            return false;
        for(int i =2; i<=num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions of matrix: ");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int matrix1[][] = new int[m1][n1];
        System.out.print("Enter 1st matrix elements: ");
        for(int i =0; i<m1; i++)
            for(int j=0; j<n1; j++)
                matrix1[i][j] = sc.nextInt();
                System.out.println("Matrix 1: ");
        for(int i =0; i<m1; i++){
            for(int j=0; j<n1; j++){
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.print("\n");
        }
        int evenSum=0,primeSum=0;
        for(int i =0; i<m1; i++){
            for(int j=0; j<n1; j++){
                if(matrix1[i][j]%2==0)
                    evenSum += matrix1[i][j];
                if(isPrime(matrix1[i][j])){
                    primeSum += matrix1[i][j];
                }
            }
        }
        System.out.println("Even elements sum = "+evenSum);
        System.out.println("Prime elements sum = "+primeSum);
            
    }
   
}
