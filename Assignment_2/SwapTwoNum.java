import java.util.Scanner;
class SwapTwoNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.println("enter two numbers to swap them");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("number swapped are first = "+a+"\nsecond = "+b);
		
	}
}