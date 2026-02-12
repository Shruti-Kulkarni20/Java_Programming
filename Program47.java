//Count small letters in string
//String 

import java.util.Scanner;

public class Program47 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt  = 0,iCount = 0;

        System.out.println("Enter String : ");
        String name = sobj.nextLine();

        char Arr[]  = name.toCharArray();

        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                iCount++;
            }
        }

        System.out.println("Number of small characters are : "+iCount);
        
        sobj.close();
    }
    
}
