package Java;

import java.util.Scanner;

class Digit
{
    public int CountDigit(int iNo)
    {
        int iCount = 0, iDigit = 0;

        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;
        }

        return iCount;
    }

}

public class Program15 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();

        int iRet = dobj.CountDigit(iValue);

        System.out.println("Count Digit : "+iRet);

        sobj.close();
        
    }
    
}
