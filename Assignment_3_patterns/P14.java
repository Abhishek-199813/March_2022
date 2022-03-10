import java.util.*;
import java.util.Scanner;

class P14{
	public static void main(String[] args)
	{
	int num=0;
	for(int i=5;i>=1;i--)
		{
			
			//System.out.print("***"+i);
			for(int k=5;k>=num;k--)
			{
				//System.out.print("**"+k);
				System.out.print("");
			}	
			for(int j=1;j<=i;j++)
			{
			System.out.print(j+" ");
			}
		num++;
		System.out.println();

		}	
		
		}
}

