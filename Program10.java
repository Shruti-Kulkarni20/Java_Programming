package Java;
import java.util.*;

class Number
{
    public void DisplayFactor(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt <= (iNo/2);iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println("Factores of Number are : "+ iCnt);
            }
        }

    }
}

public class Program10
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        iValue =sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayFactor(iValue);

        sobj.close();
        
    }
    
}
