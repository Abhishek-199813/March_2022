import java.util.*;
import java.util.Scanner;

class PS5{
	public static void main(String[] args)
	{
	int num=0;
	for(int i=1;i<=15; i++)
		{
			
            if(i%2==0)
            {
                continue;
            }
			//System.out.print("***"+i);
			for(int k=15;k>=i;k--)
			{
				//System.out.print("**"+k);
				System.out.print(" ");
			}	
			for(int j=1;j<=i;j++)
			{
			
			System.out.print("* ");
			
			}
		num++;
		System.out.println();

		}	
		
		}
}

