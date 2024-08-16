import java.util.Scanner;;;

public class magicSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter dimension of the square matrix: ");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.err.print("\n");
        }

        int arrCheck[] = new int[n*2+2];
        int arrCheckPos = 0;

        for(int i=0;i<n;i++){
            int rowsum =0;
            for(int j=0;j<n;j++){
                rowsum += matrix[i][j];
            }
            arrCheck[arrCheckPos++] = rowsum;
        }
        for(int j=0;j<n;j++){
            int colsum =0;
            for(int i=0;i<n;i++){
                colsum += matrix[i][j];
            }
            arrCheck[arrCheckPos++] = colsum;
        }
        int diagSum =0;
        int altDiagSum=0;
        for(int i=0;i<n;i++){
            diagSum += matrix[i][i];
            altDiagSum += matrix[i][n-i-1];
        }
        arrCheck[arrCheckPos++] = diagSum;
        arrCheck[arrCheckPos++] = altDiagSum;

        int flag = 1;
        for(int i=1;i<(n*2+2);i++){
            if(arrCheck[i-1]!=arrCheck[i]){
                flag=0;
                break;
            }
        }

        if (flag==1) {
            System.out.println("Magic square matrix");
        }
        else{
            System.out.println("Not a magic square matrix");
        }
        sc.close();
    }
}
