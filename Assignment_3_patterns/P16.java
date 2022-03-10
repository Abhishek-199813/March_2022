import java.util.*;
import java.util.Scanner;

class P16{
	public static void main(String[] args)
	{
	int num=0;
	for(int i=1;i<=15;i++)
		{
			
			//System.out.print("***"+i);
			for(int k=15;k>=num;k--)
			{
				//System.out.print("**"+k);
				System.out.print("");
			}	
			for(int j=1;j<=15;j++)
			{
			System.out.print(j+" ");
			}
		num++;
		System.out.println();

		}	
		
		}
}

