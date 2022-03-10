import java.util.*;
import java.util.Scanner;

class PP7{
	public static void main(String[] args)
	{
	int count=0;
       
        for(int i=9;i>=1; i--)
		{
	
            for(int k=0;k<count;k++)
          {
              System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
			System.out.print(i+" ");
          }
          count++;

		System.out.println("");
		
		}
        

        
}
}

