import java.util.Scanner;

public class nonDiagonalElements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension of square matrix: ");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        System.out.print("Enter elements: ");
        for(int i =0; i<n; i++)
            for(int j=0; j<n; j++)
                matrix[i][j] = sc.nextInt();

        System.out.println("Entered Matrix");
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }

        int sum = 0;
        System.out.println("Matrix");
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || j==n-i-1){
                    System.out.print("\t");
                    continue;
                }
                sum += matrix[i][j];
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("Non diagonal element sum = " + sum);
        sc.close();
    }
}
