//area of cirle using static method

import java.util.Scanner;

public class Program60 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Radius : ");
        double radius = sobj.nextDouble();
        double area = (22*radius*radius)/7;
        System.out.println("Area of circle is : "+area);
        
        sobj.close();
    }
    
}
