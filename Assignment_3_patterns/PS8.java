import java.util.*;
import java.util.Scanner;

class PS8{
	public static void main(String[] args)
	{
	
    for(int i=1;i<=5; i++)
		{
			
            
			//System.out.print("***"+i);
			for(int k=5;k>=i;k--)
			{
				//System.out.print("**"+k);
				System.out.print("");
			}	
			for(int j=1;j<=i;j++)
			{
			
			System.out.print("*");
			
			}
		
		System.out.println();

		}	
	for(int i=4;i>=1; i--)
		{
			
            
			//System.out.print("***"+i);
			for(int k=15;k>=i;k--)
			{
				//System.out.print("**"+k);
				System.out.print("");
			}	
			for(int j=i;j>=1;j--)
			{
			
			System.out.print("*");
			
			}
		
		System.out.println();

		}
		
		}
}

