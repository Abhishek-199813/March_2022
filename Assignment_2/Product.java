import java.util.Scanner;
class Product
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		int d = a * b;
		System.out.println("product is "+d);
	}
}