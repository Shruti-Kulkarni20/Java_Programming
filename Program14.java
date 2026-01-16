package Java;   // Summation of factors and non factors 
import java.util.*;

class Number 
{
    public void FactorNonFactorSum(int iNo)
    {
        int iCnt = 0, iSum1 = 0,iSum2 = 0;

        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum1 = iSum1 + iCnt;
            }
            else
            {
                iSum2 = iSum2 + iCnt;
            }
        }

        System.out.println("Summation of Non factors are : "+iSum1);
        System.out.println("Summation of factors are : "+iSum2);

    }
}

public class Program14
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue =sobj.nextInt();

        Number nobj = new Number();

        nobj.FactorNonFactorSum(iValue);

        sobj.close();
        
    }
    
}
