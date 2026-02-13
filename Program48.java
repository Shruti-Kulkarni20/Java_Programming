import java.util.Scanner;

class StringX
{
    public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0,iCount = 0;

        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }

        return iCount;
    }
}

public class Program48 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter string : ");
        String str = sobj.nextLine();

       StringX obj = new StringX();

        int iRet = 0;

        iRet = obj.CountSmall(str);

        System.out.println("Number of small characters are : "+iRet);

        sobj.close();
    }
    
}
