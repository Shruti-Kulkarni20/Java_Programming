//treeset

import java.util.TreeSet;

public class Program96
{
    public static void main(String[] args) 
    {
        TreeSet<String> t = new TreeSet<>();

        System.out.println("Treeset element : "+ t);

        t.add("java");
        t.add("C");
        t.add("C++");
        t.add("python");

        System.out.println("Treeset element : "+ t);

        //check
        String s = "C";
        System.out.println("Contains : "+ s + " "+t.contains(s));

        //first value
        System.out.println("First value : "+t.first());

        // Print the last element in the TreeSet
        System.out.println("Last Value " + t.last());

        //remove
        t.remove("C");

        System.out.println("Treeset element after removing C: "+ t);

        //remove first elemnt
        t.pollFirst();

        System.out.println("Treeset element after removing 1st element : "+ t);

        //removelast elemnt
        t.pollLast();

        System.out.println("Treeset element after removing last element : "+ t);
        
    }
    
}
