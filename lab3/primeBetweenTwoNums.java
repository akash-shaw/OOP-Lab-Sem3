import java.util.Scanner;;

public class primeBetweenTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower limit: ");
        int m = sc.nextInt();

        System.out.print("Enter upper limit: ");
        int n = sc.nextInt();

        for(int i=m;i<=n;i++){
            if (i<=1) {
                continue;
            }
            else{
                int flag=1;
                for(int j = 2; j<=i/2; j++){
                    if(i%j==0){
                        flag=0;
                        break;
                    }
                }
                if(flag==1){
                    System.out.print(i+" ");
                }
            }
        }
        sc.close();
    }
}
