//Area of triangle 

import java.util.Scanner;

public class Program67 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the width of triangle : ");
        double b = sobj.nextDouble();

        System.out.println("Enter the Height of triangle : ");
        double h = sobj.nextDouble();

        double area = (b * h)/2;

        System.out.println("Area of triangle is : "+area);

        sobj.close();
    }
    
}
