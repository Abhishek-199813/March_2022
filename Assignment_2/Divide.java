import java.util.Scanner;
class Divide
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to divide and it's divisor");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("answer is : "+c);
	}
}