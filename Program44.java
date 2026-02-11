//String

import java.util.Scanner;

public class Program44
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String name = sobj.nextLine();

        for(int i = 0;i < name.length();i++)
        {
            System.out.println(name.charAt(i));
        }
        sobj.close();
        
    }
    
}
