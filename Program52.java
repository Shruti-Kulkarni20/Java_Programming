import java.util.Scanner;

public class Program52 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        int iCnt = 0;

        System.out.println("Enter the elements : ");
        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the array are : ");
        for(iCnt = 0;iCnt <Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        Arr = null;
        sobj.close();
        
    }
    
}
