import java.util.*;
import java.util.Scanner;

class PS4{
	public static void main(String[] args)
	{
	int num=0;
	for(int i=5;i>=1; i--)
		{
			
			//System.out.print("***"+i);
			for(int k=5;k>=i;k--)
			{
				//System.out.print("**"+k);
				System.out.print(" ");
			}	
			for(int j=i;j>=1;j--)
			{
			
			System.out.print("*");
			
			}
		num++;
		System.out.println();

		}	
		
		}
}

