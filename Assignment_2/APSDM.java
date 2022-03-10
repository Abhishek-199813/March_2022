import java.util.Scanner;
class APSDM
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		int c = a + b;
		int d = a * b;
		int e = a - b;
		int f = a / b;
		int g = a % b;
		System.out.println("addition "+c+"\nproduction "+d+"\nsubtraction "+e+"\ndivision "+f+"\nmod "+g);
	}
}