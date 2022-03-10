import java.util.*;
import java.util.Scanner;

class P8{
	public static void main(String[] args)
	{
		int num=0;
		for(int i=5;i>=1;i--)
		{
			for(int k=5;k>=num;k--)
			{
				System.out.print(" ");
			}	
			for(int j=i;j<=5;j++)
			{

				System.out.print(j+" ");
		}
		
		num++;
		System.out.println();

		}	
		
		}
}

