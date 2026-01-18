package Java;

import java.util.Scanner;

class Number
{
    public int CountFrequency(int iNo)
    {
        int iCnt = 0,iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            if(iDigit == 5)
            {
                iCnt++;
            }
            iNo = iNo/10;
            
        }
        return iCnt;
    }

}

public class Program18 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        int iRet = nobj.CountFrequency(iValue);

        System.out.println("Count of 5 in Number "+iValue+" is :"+iRet);

        sobj.close();
        
    }
    
}
