/**
 * patternFor
 */
import java.util.Scanner;
public class patternFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of lines: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}