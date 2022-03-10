import java.util.*;
import java.util.Scanner;

class P9{
	public static void main(String[] args)
	{
	int num=0;	
	for(char i='A';i<='E';i++)
		{
			for(int k=5;k>=num;k--)
			{
				System.out.print(" ");
			}	
			for(char j='A';j<=i;j++)
			{

				System.out.print(j+" ");
		}
		num++;
		System.out.println();

		}	
		
		}
}

