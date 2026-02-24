//area of cirle using constructor

import java.util.Scanner;

class Area
{
    double area;
    Area(double radius)
    {
        area = (22*radius*radius)/7;
    }
}
public class Program63
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Radius : ");
        double radius = sobj.nextDouble();
        
        Area aobj = new Area(radius);

        System.out.println("Area of circle is : "+aobj.area);
        
        sobj.close();
    }
    
}
