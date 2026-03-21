//vector

import java.util.Vector;

public class Program92 
{
    public static void main(String[] args) 
    {
        Vector<Integer> v = new Vector<Integer>();

        v.add(11);
        v.add(21);
        v.add(51);
        v.add(101);
        v.add(111);

        System.out.println("vector : " + v);

        //Using set() method to replace 101 with 105
        System.out.println("The object that is replaced is : "+v.set(3, 105));

        System.out.println("the new vector is : " + v);
        
        //removing 4th element
        v.remove(3);

        System.out.println("After removing 3rd element : "+ v);

        //Iterating
        for(int i = 0;i < v.size();i++)
        {
            System.out.print(v.get(i) + " ");
        }

        System.out.println();

        for(int i: v)
        {
            System.out.print(i + " ");
        }
    }
    
}
