import java.util.Scanner;
class Average
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the three numbers to calculate their average");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c	= sc.nextFloat();		
		float d = (a+b+c)/3;
		System.out.println("average= "+d);
		
	}
}