package Java;
import java.util.*;

class Number 
{
    public int NonFactorSum(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
}

public class Program13
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue =sobj.nextInt();

        Number nobj = new Number();

        int iRet = nobj.NonFactorSum(iValue);

        System.out.println("Summation  is : "+ iRet);
        
        sobj.close();
        
    }
    
}
