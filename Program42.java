//String

import java.util.Scanner;

public class Program42 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sobj.nextLine();

        System.out.println("Your name is :"+name);

        System.out.println("String length is : "+name.length());

        sobj.close();
    }
    
}
