import java.util.Scanner;
class Addtion
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two numbers you want to add");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("Sum is : "+c);
	}
}