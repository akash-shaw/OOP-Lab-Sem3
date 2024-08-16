import java.util.Scanner;

public class symmetrixMAtrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension of square matrix: ");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        System.out.print("Enter elements: ");
        for(int i =0; i<n; i++)
            for(int j=0; j<n; j++)
                matrix[i][j] = sc.nextInt();

        System.out.println("Entered Matrix: ");
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }

        int flag = 1;
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]!=matrix[j][i]){
                    flag=0;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("Not a square matrix");
        }
        else{
            System.out.println("Square matrix");
        }
        sc.close();
    }
}
