import java.util.Scanner;

class StringX
{
    public String str;

    public int CountSmall()
    {
        char Arr[] = str.toCharArray();

        int iCount = 0, iCnt = 0;

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

public class Program49 
{
     public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter string : ");
        String data = sobj.nextLine();

        StringX obj = new StringX();

        obj.str = data;

        int iRet = 0;

        iRet = obj.CountSmall();

        System.out.println("Number of small characters are : "+iRet);

        sobj.close();
    }
    
}
