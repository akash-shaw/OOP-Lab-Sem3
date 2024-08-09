class displayNum
{
	public static void main(String args[])
	{
		int num, positive=0, negetive=0, zero=0;

		for(int i=0; i<10; i++)
		{
			num = Integer.parseInt(args[i]);
			if(num == 0)
				zero++;
			else if(num > 0)
				positive++;
			else
				negetive++;
		}
		

		System.out.println("Zero = "+zero+"\nPositive = "+positive+"\nNegetive = "+ negetive);
	}
}