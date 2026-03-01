//Perimetere of square

import java.util.*;

public class Program69 
{ 
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the side of the square:");
         
	     double a= s.nextDouble();
	 
         double  perimeter=4*a;
     
	    System.out.println("perimeter of Square is: " + perimeter);     
        
        s.close();
   }
    
}
