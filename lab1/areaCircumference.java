class areaCircumference
{
	public static void main(String args[])
	{
		int length, breadth, area, circumference;
		
		length = Integer.parseInt(args[0]);
		breadth = Integer.parseInt(args[1]);
		area = length * breadth;
		circumference = 2*(length+breadth);

		System.out.println("Area = "+area+"\nCircumference = "+circumference);
	}
}