//Iterating over a Collection

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Program87 
{
    public static void main(String[] args) 
    {
        Collection<String> l = new LinkedList<>();
        l.add("Geeks");
        l.add("For");
        l.add("Geeks");

        System.out.println("The list is : "+ l);

        Iterator<String> it = l.iterator();
        System.out.println("Iterator values : ");

        while (it.hasNext()) 
        {
            System.out.println(it.next() + " ");
        }
        
    }
    
}
