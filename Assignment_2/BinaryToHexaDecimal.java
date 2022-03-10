import java.util.Scanner;
class BinaryToHexaDecimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the Binary number to convert it into HexaDecimal ");
		String a = sc.next();
		int Hexadecimal = Integer.parseInt(a,2);
		
		System.out.println("Hexadecimal number is:"+Integer.toHexString(Hexadecimal));
		
	}	
}