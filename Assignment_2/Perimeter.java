import java.util.Scanner;
class Perimeter
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the radius of the circle");
		float a = sc.nextFloat();
					
		
		System.out.println("perimeter ="+(2 * 3.14 * a)+"\narea = "+(3.14*a*a));
		
	}
}