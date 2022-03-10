import java.util.*;
import java.util.Scanner;

class P17{
	public static void main(String[] args)
	{
	int num=0,c=1;
	for(char i='A';i<='E';i++)
		{
			
			//System.out.print("***"+i);
			for(int k=5;k>=num;k--)
			{
				//System.out.print("**"+k);
				System.out.print("");
			}	
			for(char j=i;j<='E';j++)
			{
			
			System.out.print(j+" ");
			
			}
		num++;
		System.out.println();

		}	
		
		}
}

