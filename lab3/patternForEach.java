import java.util.Scanner;

public class patternForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no of lines: ");
        int n = sc.nextInt();

        int a[][] = new int [n][];
        
        for (int i = 0; i < n; i++) {
            a[i] = new int[i+1];
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                a[i][j] = i+1;
            }
        }
        
        for (int[] row : a) {
            for (int value : row) {
                System.out.print(value+" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
