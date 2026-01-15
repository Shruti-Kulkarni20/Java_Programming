package Java;

import java.util.Scanner;

public class Program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first Number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the Second Number : ");
        int iNo2 = sobj.nextInt();

        int Addition = iNo1 + iNo2;

        System.out.println("Addition is "+ Addition);

        sobj.close();
    }
    
}
