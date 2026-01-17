package Java;

import java.util.Scanner;

class Digit
{
    public int CountDigit(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;          //updator
        }

        while (iNo > 0) 
        {
           iCnt++;
           iNo = iNo / 10;   
        }

        return iCnt;
    }

}

public class Program17 
{
    
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();

        int iRet = dobj.CountDigit(iValue);

        System.out.println("Count digit : "+iRet);

        sobj.close();
    }
}
