//perimeter of circle

import java.util.Scanner;

public class Program65 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the radius : ");

        double r = sobj.nextDouble();

        double c = (22*2*r)/7;

        System.out.println("Perimeter of circle : "+c);

        sobj.close();
        
    }
    
}
