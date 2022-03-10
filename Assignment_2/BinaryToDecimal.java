import java.util.Scanner;
class BinaryToDecimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the Binary number to convert it into Decimal ");
		String a = sc.next();
		int decimal = Integer.parseInt(a,2);
		System.out.println("decimal number is:"+decimal);
	}	
}