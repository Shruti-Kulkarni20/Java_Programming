//Removing elemnts

import java.util.ArrayList;
import java.util.Collection;

public class Program85 
{
    public static void main(String[] args) 
    {
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("mango");
        fruits.add("Orange");

        System.out.println("Initial collection : "+ fruits);

        //remove specific element
        fruits.remove("mango");
        System.out.println("After removing mango : "+fruits);

        //Remove all elements present in another collection
        Collection<String> toRemove = new ArrayList<>();
        toRemove.add("Apple");
        toRemove.add("Banana");

        fruits.removeAll(toRemove);
        System.out.println("After removeAll(): "+fruits);
        
    }
    
}
