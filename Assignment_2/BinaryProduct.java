import java.util.Scanner;
class BinaryAdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i=0;
		int carry=0;
		System.out.println("enter the numbers in binary form to add them");
		long a = sc.nextLong();
		long b = sc.nextLong();
		int[] sum = new int[10];
		
		
		while(a!=0 || b!=0)
		{
			sum[i++] = (int)((a%10 + b%10 + carry)%2);
			carry = (int)((a%10 + b%10 + carry)/2);
			a = a/10;
			b = b/10;
		}
		if(carry!=0)
		{
			sum[i++] = carry;
			
		}
		--i;
		System.out.println("Output: ");
		while(i>=0)
		{
			System.out.print(sum[i--]);
		}
		System.out.println("\n");
		
		
	}
}