import java.util.*;
import java.util.Scanner;

class PS1{
	public static void main(String[] args)
	{
	int num=0;
	for(int i=1;i<=5; i++)
		{
			
			//System.out.print("***"+i);
			for(int k=5;k>=num;k--)
			{
				//System.out.print("**"+k);
				System.out.print("");
			}	
			for(int j=1;j<=i;j++)
			{
			
			System.out.print("*");
			
			}
		num++;
		System.out.println();

		}	
		
		}
}

