import java.util.Scanner;
class DecimalIntoBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
//		int d=0,i=0;
//	    int carry=0;
		
		System.out.println("enter the decimal number to convert it into binary ");
		String a = sc.next();
		
		int binary = Integer.parseInt(a,2);
		
		System.out.println("binary number is "+Integer.toBinary(binary));
		
		/*int[] DecNum = new int[10];
		
		while(a!=0)
		{
			DecNum[i++] = a%2;
			a=a/2;
			
		}
		
		while(i>=0){
		System.out.print(DecNum[i--]);
		}*/
	}
}