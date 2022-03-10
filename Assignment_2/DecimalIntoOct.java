import java.util.Scanner;
class DecimalIntoOct
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int d=0,i=0;
		int carry=0,p=0;
		System.out.println("enter the decimal number to convert it into binary ");
		int a = sc.nextInt();
		
		System.out.println("ocatal number is: "+Integer.toOctalString(a));
	}	
}