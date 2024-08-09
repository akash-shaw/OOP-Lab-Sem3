import java.util.Scanner;
class bitwise
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int nCopy = n;
		System.out.println(n + " * 2 = " + (nCopy<<=1) );
		System.out.println(n + " / 2 = " + (n>>=1) );

		sc.close();
	}
}