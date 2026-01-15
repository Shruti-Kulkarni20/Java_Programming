package Java;

import java.util.*;

class Program4
{
    public static void main(String A[])
    {
        Scanner sobj = null;
        int iNo1,iNo2,iAns ;

        sobj = new Scanner(System.in);

        System.out.println("Enter the first Number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the second Number : ");
        iNo2 = sobj.nextInt();

        iAns = iNo1 + iNo2;

        System.out.println("Addition is : "+iAns);

        sobj.close();
    }
}