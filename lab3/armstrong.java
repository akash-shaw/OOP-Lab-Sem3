/**
 * armstrong
 */
import java.util.Scanner;;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int nCpy = n;
        int d;
        int nChk = 0;
        while (nCpy!=0) {
            d = nCpy%10;
            nChk = nChk + d*d*d;
            nCpy /= 10;
        }
        if(n==nChk)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
        
        sc.close();
    }
}