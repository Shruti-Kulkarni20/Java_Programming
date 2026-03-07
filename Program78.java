//Search element in array by linear search

import java.util.Scanner;

class SearchElement
{
    public static boolean SearchEle(int arr[],int no)
    {
        for(int element: arr)
        {
            if(element == no)
            {
                return true;
            }
        }
        return false;
    }
}
public class Program78 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int isize = sc.nextInt();

        int Arr[] = new int[isize];

        for(int i = 0;i < isize;i++)
        {
           Arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to Search :");
        int no = sc.nextInt();

        boolean bRet = SearchElement.SearchEle(Arr, no);

        System.out.println("Result : "+bRet);

        sc.close();
        
    }
    
}
