package Java;

import java.util.Scanner;

class Arithmatic
{
    public int iNo1;
    public int iNo2;

    public Arithmatic(int A,int B)
    {
        this.iNo1 = A;
        this.iNo2 = B;
    }

    public int Addition()
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
}

public class Program8 
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 =0 , iRet = 0;
        Scanner sobj = new Scanner(System.in);        

        System.out.println("Enter first number :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number :");
        iValue2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iValue1,iValue2);   

        iRet = aobj.Addition();

        System.out.println("Addtion is : "+iRet);

        sobj.close();
    }
    
}
