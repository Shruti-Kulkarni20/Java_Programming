//Second largest //sorting

import java.util.Arrays;

public class Program74 
{
    public static void main(String[] args) 
    {
        int Arr [] = {10,5,20,8};

        Arrays.sort(Arr);

        int largest = Arr[Arr.length - 1];
        int secondlargest =  -1;

        for(int i = Arr.length - 2;i >= 0;i--)
        {
            if(Arr[i] != largest)
            {
                secondlargest = Arr[i];
                break;
            }
        }

        System.out.println(secondlargest);
    }
    
}
