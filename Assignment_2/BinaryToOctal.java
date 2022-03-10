import java.util.Scanner;
class BinaryToOctal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the Binary number to convert it into Octal ");
		String a = sc.next();
		int octal = Integer.parseInt(a,2);
		
		System.out.println("octal number is:"+octal);
		
	}	
}