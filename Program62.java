//area of cirle using inheritance

import java.util.Scanner;

class Areacalculation
{
    double area;
    void circle(double Radius)
    {
        area = (22*Radius*Radius)/7;
    }
}

public class Program62 extends Areacalculation
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Radius : ");
        double radius = sobj.nextDouble();

        Program62 Area = new Program62();

        Area.circle(radius);
        
        System.out.println("Area of circle is : "+Area.area);
        
        sobj.close();
    }
    
}
