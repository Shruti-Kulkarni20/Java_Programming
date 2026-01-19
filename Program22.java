package Java; //reverse


import java.util.Scanner;

class Digit
{
    public int Reverse(int iNo)
    {
        int iRev = 0,iDigit = 0;

        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            iRev = iRev * 10+ iDigit;
            iNo = iNo / 10;
        }

        return iRev;
    }
}

public class Program22
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();

        int iRet = dobj.Reverse(iValue);

        System.out.print("Reverse Number are : "+iRet);

        sobj.close();
        
    }
    
}
