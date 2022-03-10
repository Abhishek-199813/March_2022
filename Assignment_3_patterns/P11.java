import java.util.*;
import java.util.Scanner;

class P11{
	public static void main(String[] args)
	{
	int num=0;
	for(int i=13;i>=1;i--)
		{
			if(i%2==0)
			{
				continue;
			}
			//System.out.print("***"+i);
			for(int k=13;k>=num;k--)
			{
				//System.out.print("**"+k);
				System.out.print(" ");
			}	
			for(int j=i;j<=13;j++)
			{
				
				System.out.print("*");
			
		}
		num++;
		System.out.println();

		}	
		
		}
}

