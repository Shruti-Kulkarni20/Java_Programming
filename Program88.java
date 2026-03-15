//List
import java.util.*;


public class Program88 
{
    public static void main(String[] args) 
    {
        //Creating List
        List<String> list = new ArrayList<>();

        //adding element
        list.add("Java");
        list.add("Python");
        list.add("DSA");
        list.add("C++");

        System.out.println("Elements of list are : ");

        //iterating
        for(String s:list)
        {
            System.out.println(s);
        }

        //updating elemnt at 1st index using set()
        list.set(1,"PHP");

        System.out.println("Updated ArrayList: "+ list);

        //use indexOf() to find first occurance of element in the list
        int i = list.indexOf("C++");

        System.out.println("1st occurance of C++ : "+ i);

        //use lastIndexOf() to find the last occurrence of an element in the list
        list.add("PHP");
        System.out.println("Updated ArrayList: "+ list);

        int l = list.lastIndexOf("PHP");

        System.out.println("last occurance of PHP : "+ l);

        //Removing element
        //remove element by index

        list.remove(4);

        System.out.println("Updated ArrayList after removing by index: "+ list);

        //removing elemnt by current object
        list.remove("PHP");

        System.out.println("Updated ArrayList after removing by object name: "+ list);


        //Accessing elements using get()
        String first = list.get(0);
        String second = list.get(1);

        System.out.println("Accessing elemnts from index 0 and 1: "+first+" "+second);

        //checking if element is present or not

        boolean isPresent = list.contains("DSA");

        System.out.println("DSA is present in list ? :"+isPresent);
        
    }
    
}
