//area of cirle using static method

import java.util.Scanner;

public class Program64
{
    static double area(double r)
    {
        return (22*r*r)/7;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Radius : ");
        double radius = sobj.nextDouble();
        double aobj = area(radius);
        System.out.println("Area of circle is : "+aobj);
        
        sobj.close();
    }
    
}
