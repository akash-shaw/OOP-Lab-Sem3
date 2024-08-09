class palindrome
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		int numCopy=num, rev=0;
		
		while(numCopy != 0)
		{
			rev = rev*10 + numCopy%10;
			numCopy /= 10;
		}
		
		if(rev==num)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}