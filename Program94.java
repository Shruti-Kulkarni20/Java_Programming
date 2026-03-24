//set

import java.util.HashSet;
import java.util.Set;

public class Program94 
{
    public static void main(String[] args) 
    {
        //creating hashset
        Set<String> s = new HashSet<>();

        //Disply
        System.out.println("Set elements : "+ s);

        //adding elemnts
        s.add("B");
        s.add("A");
        s.add("C");
        s.add("D");

        //Disply
        System.out.println("Set elements : "+ s);


        //removing elemnt
        s.remove("B");

        //Disply
        System.out.println("Set elements : "+ s);

        //iterating
        for(String value : s)
        {
            System.out.print(value + " , ");
        }
        System.out.println();

        System.out.println("Contains B : "+ s.contains("B"));
    }
    
}
