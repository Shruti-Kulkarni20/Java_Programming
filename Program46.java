//String 

import java.util.Scanner;

public class Program46 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt  = 0;

        System.out.println("Enter String : ");
        String name = sobj.nextLine();

        char Arr[]  = name.toCharArray();

        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        
        sobj.close();
    }
    
}
