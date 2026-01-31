// Input 4  4   
/*
    a   a   a   a
    b   b   b   b
    c   c   c   c
    d   d   d   d

*/
import java.util.*;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i = 0, j = 0;
        char ch = 'a';

        for(i = 1,ch = 'a';i <= iRow;i++,ch++)
        {
            for(j = 1;j <= iCol;j++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }

}

public class Program28
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0,iValue2 = 0;

        System.out.println("Enter 1st Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter 2st Number : ");
        iValue2 = sobj.nextInt();
        
        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);

        sobj.close();

    }
}
