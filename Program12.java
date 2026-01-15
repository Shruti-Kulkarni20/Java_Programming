package Java;
import java.util.*;

class Number
{
    public void DisplayNonFactor(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                System.out.println(" Non Factores of Number are : "+ iCnt);
            }
        }

    }
}

public class Program12
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue =sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayNonFactor(iValue);

        sobj.close();
        
    }
    
}
