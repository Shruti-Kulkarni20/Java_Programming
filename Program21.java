package Java; //count even 

import java.util.Scanner;

class Digit
{
    public int CountDigit(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while (iNo != 0) 
        {
            if((iNo % 10) % 2 == 0)
            {
                iCnt++;
            }

            iNo = iNo/10;
            
        }

        return iCnt;
    }
}

public class Program21 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();

        int iRet = dobj.CountDigit(iValue);

        System.out.print("Count of Even digit in Number are : "+iRet);

        sobj.close();
        
    }
    
}
