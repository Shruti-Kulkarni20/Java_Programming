package Java;

import java.util.Scanner;

public class Program5 
{
    public static int Addition(int iNo1,int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
    public static void main(String A[])
    {
        int ivalue1 = 0,iValue2 = 0,iRet= 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first Number : ");
        ivalue1 = sobj.nextInt();

        System.out.println("Enter the second Number : ");
        iValue2= sobj.nextInt();

        iRet = Addition(ivalue1,iValue2);
        System.out.println("Addition is : "+iRet);

        sobj.close();
    }
    
}
