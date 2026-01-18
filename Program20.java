package Java;

import java.util.Scanner;

class Digit
{
    public void DisplyEven(int iNo)
    {

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while (iNo != 0) 
        {  

            if((iNo % 10 )% 2 == 0)
            {
                System.out.println(iNo % 10);
            }

            iNo =  iNo/10;
            
        }
    }
}

public class Program20 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();

        dobj.DisplyEven(iValue);

        sobj.close();
    }
    
}
