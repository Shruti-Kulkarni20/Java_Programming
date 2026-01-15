package Java; //we can create object class inside that class 

import java.util.Scanner;

public class Program6 
{
    public int Addition(int iNo1, int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

    public static void main(String A[])
    {
        Scanner sobj = null;
        int iValue1 = 0,iValue2 = 0, iRet = 0;

        sobj = new Scanner(System.in);

        System.out.println("Enter 1st Numberr : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter 2nd number : ");
        iValue2 = sobj.nextInt();

        Program6 pobj = new Program6();

        iRet = pobj.Addition(iValue1,iValue2);

        System.out.println("Addition is : "+iRet);

        sobj.close();
    }
    
}
