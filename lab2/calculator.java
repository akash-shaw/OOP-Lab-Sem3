import java.util.Scanner;
class calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char choice = 'y';

		do
		{
			System.out.print("Enter first number, operator, second number: ");
			float num1 = sc.nextFloat();
			char op = sc.next().charAt(0);
			float num2 = sc.nextFloat();
			float result = 0;

			switch(op)
			{
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1/num2;
					break;
				default:
					System.out.println("Invalid operator");
					break;
			}

			System.out.println("Answer = "+result);

			System.out.print("Do another (y/n)? ");
			choice = sc.next().charAt(0);

		}while(choice == 'y');

		sc.close();
	}
}