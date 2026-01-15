package Java;
import java.util.Scanner;

class Arithmatic
{
    public int Addition(int iNo1,int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
}
public class Program7 
{
    public static void main(String A[])
    {
        int iValue1 = 0,iValue2 = 0,iret = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number :");
        iValue2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();

        iret = aobj.Addition(iValue1,iValue2);
        System.out.println("addition is : "+iret);

        sobj.close();
    }
    
}
