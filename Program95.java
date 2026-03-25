//hashset

import java.util.HashSet;
import java.util.Iterator;

public class Program95 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(4);
        hs.add(5);
        hs.add(6);


        System.out.println("hashset size : "+ hs.size());
        System.out.println("Element in hashset are : "+ hs);

        hs.remove(3);

        System.out.println("After Removing element : "+ hs);

        //iterate using iterate method
        System.out.println("Using iterator : ");
        Iterator<Integer> it = hs.iterator();


        //traverse
        while (it.hasNext()) 
        {
            System.out.println(it.next() + ",");
        }
        
    }
    
}
