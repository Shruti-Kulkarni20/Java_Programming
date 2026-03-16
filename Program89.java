//Operation on arraylist

import java.util.ArrayList;

public class Program89 
{
    public static void main(String[] args) 
    {
        //Creating
        ArrayList<String> arrList = new ArrayList<>();

        //Adding elements to arraylist at end
        arrList.add("Java");
        arrList.add("PHP");
        arrList.add("C");

        System.out.println(" original List : "+arrList);

        //adding element at the specific index
        arrList.add(1,"Python");

         System.out.println("adding element at index 1 : "+arrList);

        //Removing by index
        arrList.remove(2);

        System.out.println("List after removing element by index : "+arrList);

        //Removing by value
        arrList.remove("Python");

         System.out.println("List after removing element by using value: "+arrList);

        //updating value 
        arrList.set(0, "Python");

         System.out.println("List after updating the value: "+arrList);


        
    }
    
}
