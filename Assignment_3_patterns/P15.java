import java.util.*;
import java.util.Scanner;

class P15{
	public static void main(String[] args)
	{
	int num=0;
	for(int i=1;i<=5;i++)
		{
			
			//System.out.print("***"+i);
			for(int k=5;k>=num;k--)
			{
				//System.out.print("**"+k);
				System.out.print("");
			}	
			for(int j=5;j>=i;j--)
			{
			System.out.print(j+" ");
			}
		num++;
		System.out.println();

		}	
		
		}
}

