import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find out it's table");
		int a = sc.nextInt();
		for(int i = 1; i<=10; i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
		}
		
	}
}