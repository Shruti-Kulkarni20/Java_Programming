// Input 4  4   
/*
    a   a   a   a
    B   B   B   B
    c   c   c   c
    D   D   D   D
*/
import java.util.*;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i = 0, j = 0;
        char ch = 'a', ch2 = 'A';

        for(i = 1,ch = 'a',ch2 = 'A';i <= iRow;i++,ch++,ch2++)
        {
            for(j = 1;j <= iCol;j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(ch2+"\t");
                }
                else
                {
                    System.out.print(ch+"\t");
                }
            }
            System.out.println();
        }
    }

}

public class Program29
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
