//Adding elements to collection

import java.util.ArrayList;
import java.util.Collection;

public class Program84 
{
    public static void main(String[] args) 
    {
        //creating collection
        Collection<Integer> numbers = new ArrayList<>();

        //Adding elements
        numbers.add(11);
        numbers.add(21);
        numbers.add(51);

        //Adding another collection
        Collection<Integer> morenumbers = new ArrayList<>();

        morenumbers.add(101);
        morenumbers.add(111);

        numbers.addAll(morenumbers);

        System.out.println("After adding elements : "+ numbers);
        
    }
    
}
