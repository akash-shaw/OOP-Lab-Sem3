import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int a[] = new int [n];

        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter no to search: ");
        int key = sc.nextInt();

        int pos = 0;
        int flag=0;
        System.out.print("Value found at: ");
        for(int i : a){
            if(i==key){
                System.out.print("a["+pos+"], ");
                flag=1;
            }
            pos++;
        }
        if(flag==0){
            System.out.print("Not found");
        }

        sc.close();
    }
}
