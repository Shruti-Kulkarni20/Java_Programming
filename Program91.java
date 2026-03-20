//vector
/*
When a Vector is created using the default constructor, 
it is initialized with a default capacity of 10. 
This means it can hold up to 10 elements before needing to grow in size.
If the number of elements exceeds the current capacity, 
the Vector automatically increases its capacity. 
*/

import java.util.Vector;

public class Program91 
{
    public static void main(String[] args) 
    {
        Vector<Integer> vec = new Vector<>(2); //initial capacity =2
        System.out.println("Initial capacity : " +vec.capacity());

        //add elements to trigger capacity increase
        vec.add(10);
        vec.add(20);

        System.out.println("Capacity after adding 2 elemnts : "+vec.capacity());

        vec.add(30);//triggers resize(2 -> 4)
        System.out.println("Capacity after adding 3 elemnts : "+vec.capacity());

        vec.add(40);
        vec.add(50); //(4 -> 8)

        System.out.println("Capacity after adding 5 elemnts : "+vec.capacity());

        //creating default vector
        Vector v1 = new Vector();

        v1.add(1);
        v1.add(2);
        v1.add("three");
        v1.add("four");
        v1.add(5);

        System.out.println("Vector v1 is : "+ v1);


        //Creating generic vector

        Vector<Integer> v2 = new Vector<>();

        v2.add(1);
        v2.add(2);
        v2.add(3);

        System.out.println("Vector v2 is : " + v2);


    }
    
}
