import java.util.*;
import java.util.Scanner;

class PP13{
	public static void main(String[] args)
	{
        
       
    for(int i=1;i<=5; i++)
	{
      for(int k=5;k>=i;k--)
      {
        System.out.print(" ");
      }
            for(int j=1;j<=i;j++)
            {
                if(i==5 || j==1 )
			 System.out.print("*");
                else
                System.out.print(" ");

            }
            for(int j=2;j<=i;j++)
            {
                if(i==j || i==5 )
			 System.out.print("*");
                else
                System.out.print(" ");

            }

            
            System.out.println("");
            
          }
       

      
        

		
		
		}
        

        
}


