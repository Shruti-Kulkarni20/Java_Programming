//Array max element

import java.util.Scanner;

class MaxElement
{
    public int Maximum(int arr[])
    {
       int max = arr[0];
       for(int i  = 0;i < arr.length;i++)
       {
         if(arr[i] > max)
         {
            max = arr[i];
         }
       }
       return max;
    }
}
public class Program72 
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size :");
        int n = sobj.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element of array :");
        for(int i = 0;i < n;i++)
        {
            arr[i] = sobj.nextInt();
        }

        MaxElement mobj = new MaxElement();

        int iRet = mobj.Maximum(arr);

        System.out.println("Maximum is : "+iRet);

        sobj.close();
    }
    
}
