//Second largest using treeset

import java.util.TreeSet;

public class Program75 
{
    public static void main(String[] args) 
    {
        int [] arr = {7,2,3,9,9};

        TreeSet<Integer> set = new TreeSet<>();

        for(int num: arr)
        {
            set.add(num);
        }

        if(set.size() < 2)
        {
            System.out.println("No secomd largest element");
        }
        else
        {
            int largest = set.last();
            int secondlargest = set.lower(largest);

            System.out.println("Second largest element : "+secondlargest);
        }
        
    }
    
}
