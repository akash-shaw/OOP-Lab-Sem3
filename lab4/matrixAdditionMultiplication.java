import java.util.Scanner;

public class matrixAdditionMultiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions of first matrix: ");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        System.out.print("Enter dimensions of second matrix: ");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();


        int matrix1[][] = new int[m1][n1];
        int matrix2[][] = new int[m2][n2];

        System.out.print("Enter 1st matrix elements: ");
        for(int i =0; i<m1; i++)
            for(int j=0; j<n1; j++)
                matrix1[i][j] = sc.nextInt();
        
        System.out.print("Enter 2nd matrix elements: ");
        for(int i =0; i<m2; i++)
            for(int j=0; j<n2; j++)
                matrix2[i][j] = sc.nextInt();

        System.out.println("Matrix 1: ");
        for(int i =0; i<m1; i++){
            for(int j=0; j<n1; j++){
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("Matrix 2: ");
        for(int i =0; i<m2; i++){
            for(int j=0; j<n2; j++){
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.print("\n");
        }
        if(m1==m2 && n1==n2){
            System.out.println("Matrix 1 + Matrix 2 =");
            for(int i =0; i<m2; i++){
                for(int j=0; j<n2; j++){
                    System.out.print((matrix1[i][j]+matrix2[i][j]) + "\t");
                }
                System.out.print("\n");
            }
        }
        else{
            System.out.println("Matrix addition not possible for different dimensions");
        }
        if(n1==m2){
            int matrix3[][] = new int[m1][n2];
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    matrix3[i][j] = 0;
                    for (int k = 0; k < n1; k++) {
                        matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("Matrix 1 * Matrix 2 =");
            for(int i =0; i<m1; i++){
                for(int j=0; j<n2; j++){
                    System.out.print(matrix3[i][j] + "\t");
                }
                System.out.print("\n");
            }
        }
        else{
            System.out.println("Matrix multiplication not possible. Columns2 != Rows1");
        }
        sc.close();
    }
}
