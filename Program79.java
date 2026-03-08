//Palindrome Number

import java.util.Scanner;

public class Program79 
{
    public static void main(String[] args) 
    {
        int iDigit = 0,iRev = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNum = sc.nextInt();
        int iNo = iNum;

        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;  
        }

        if(iNum == iRev)
        {
            System.out.println("Number is Palindrom");
        }
        else
        {
            System.out.println("Number is not palindrom");
        } 
        
        sc.close();
    }
    
}
