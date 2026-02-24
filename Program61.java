//area of cirle using interface

import java.util.Scanner;

interface AreaCal
{
    public void circle(double x);
}

class Program61 implements AreaCal
{
    double area;
    public void circle(double radius)
    {
        area = (22*radius*radius)/7;
    }
    public static void main(String[] args) 
    {
        Program61 x;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Radius : ");
        double rad = sobj.nextDouble();
        x = new Program61();
        x.circle(rad);
        System.out.println("Area of circle is : "+x.area);
        
        sobj.close();
    }
}
