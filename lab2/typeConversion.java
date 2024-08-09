import java.util.Scanner;
class typeConversion
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter int number: ");
		int intNum = sc.nextInt();
		System.out.print("Enter double number: ");
		double doubleNum = sc.nextDouble();
		System.out.print("Enter character: ");
		char ch = sc.next().charAt(0);
		
		System.out.println("int to byte: "+(byte) intNum);
		System.out.println("char to int: "+(int) ch);
		System.out.println("double to byte: "+(byte) doubleNum);
		System.out.println("double to int: "+(int) doubleNum);

		sc.close();
	}
}