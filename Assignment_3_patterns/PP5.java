import java.util.*;
import java.util.Scanner;

class PP5{
	public static void main(String[] args)
	{
	
       
        for(int i=9;i>=1; i--)
		{
		
            
			for(int k=i;k>=1;k--)
            {
                System.out.print(" ");
        
            }
            for(int k=i;k<=9;k++)
            {
                System.out.print(k+" ");
            }
            for(int j=8;j>=i;j--){
			System.out.print(j+" ");
          }
//          for(int k=i-1;k<=1;k++){
  //          System.out.print(k);
    //     }

        
		System.out.println();
		
		}
}
}

