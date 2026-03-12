//Collection

import java.util.ArrayList;
import java.util.Collection;

public class Program83 
{
    public static void main(String[] args) 
    {
        //Creating collection of string type using arraylist

        Collection<String> fruits = new ArrayList<>();

        //Adding elements to the collection

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        //displaying 
        System.out.println("After Removal : "+fruits);
        
    }
    
}
