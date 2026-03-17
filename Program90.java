//LinkedList

import java.util.LinkedList;

public class Program90 
{
    public static void main(String[] args) 
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Java");
        ll.add("Python");
        ll.add("PHP");
        ll.add("C");
        ll.add("C++");

        System.out.println(ll);

        ll.set(4,"Perl");

        System.out.println("After updating"+ll);

        ll.remove("Perl");

        System.out.println("After removing"+ll);

        //iterating
        for(int i = 0;i < ll.size();i++)
        {
            System.out.print(ll.get(i)+ " ");
        }
        System.out.println();

        //using for each
        for(String str:ll)
        {
            System.out.println( str + " ");
        }
        
    }
    
}
