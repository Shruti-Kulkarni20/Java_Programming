//Perimeter of circle using static function

import java.util.Scanner;

public class Program66 
{
    public static double area(double r)
    {
        double a = (22*2*r)/7;

        return a;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Radius : ");

        double r = sobj.nextDouble();

        double area = Program66.area(r);

        System.out.println("Perimeter of circle is : "+area);

        sobj.close();
        
    }
    
}
