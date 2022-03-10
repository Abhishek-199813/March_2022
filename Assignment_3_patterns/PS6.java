import java.util.*;
import java.util.Scanner;

class PS6{
	public static void main(String[] args)
	{
	int num=0;
	for(int i=15;i>=1; i--)
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
			for(int j=i;j>=1;j--)
			{
			
			System.out.print("* ");
			
			}
		num++;
		System.out.println();

		}	
		
		}
}

