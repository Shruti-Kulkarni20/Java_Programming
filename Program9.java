package Java; //Check Even Odd
import java.util.*;

class Number
{
    public boolean CheckEven(int iNo)
    {
        if((iNo % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

public class Program9
{
    public static void main(String[] args)
    {
        int iValue = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the nUmber : ");
        iValue = sobj.nextInt();

       Number nobj = new Number();

       bRet = nobj.CheckEven(iValue);

       if(bRet)
       {
         System.out.println(iValue+" is Even");
       }
       else
       {
         System.out.println(iValue+" is not Even");
       }

       sobj.close();
    }
    
}
