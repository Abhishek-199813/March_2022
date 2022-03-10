import java.util.*;
import java.util.Scanner;

class PP10{
	public static void main(String[] args)
	{
	int count=0;
       
        for(int i=5;i>=1; i--)
		{
	
            for(int k=0;k<count;k++)
          {
              System.out.print("");
            }

            for(int j=i;j>=1;j--){
			if(j==1 || i==5 || i==j){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
          }
          count++;

		System.out.println("");
		
		}
        

        
}
}

