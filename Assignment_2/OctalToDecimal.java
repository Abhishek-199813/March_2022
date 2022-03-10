import java.util.Scanner;
class OctalToDecimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the octal to convert it into Binary ");
		String a = sc.next();
		int decimal = Integer.parseInt(a,8);
		
		System.out.println("decimal number is:"+decimal);
		
	}	
}