import java.util.Scanner;
class Rectangle_AP
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the length and breadth");
		float a = sc.nextFloat();
		float b = sc.nextFloat();

		System.out.println("Area="+(a*b)+"\nPerimeter="+(2*(a+b)));
		
	}
}