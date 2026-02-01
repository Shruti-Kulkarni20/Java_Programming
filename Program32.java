// Input 4  4   
/*

    *   *   *   *
    *   o   o   *
    *   o   o   *
    *   *   *   *
    
*/

import java.util.*;

class Pattern1
{
    public void Display(int iRow,int iCol)
    {
        int i = 0, j = 0;

        for(i = 1;i <= iRow;i++)
        {
            for(j = 1; j <= iCol;j++)
            {
                if((j == 1) || (j == iCol)||(i == 1) || (i == iRow))
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("o\t");
                }
            }
            System.out.println();
        }
    }

}

public class Program32
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0,iValue2 = 0;

        System.out.println("Enter 1st Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter 2st Number : ");
        iValue2 = sobj.nextInt();
        
        Pattern1 pobj = new Pattern1();
        pobj.Display(iValue1,iValue2);

        sobj.close();

    }
}
