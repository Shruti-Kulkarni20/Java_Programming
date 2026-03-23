//stack implemntation by using LInked List

import java.util.Stack;

public class Program93 
{
    public static void main(String[] args) 
    {
        //crateing stack (generic)
        Stack<Integer> s = new Stack<>();

        //push elements 
        s.push(11);
        s.push(21);
        s.push(51);
        s.push(101);
        s.push(111);

        //accessing elements
        System.out.println("Initial stack : " + s);

        //fetching element at the head of stack
        System.out.println("The element at the top of the stack is "+ s.peek());

        System.out.println("final stack : " + s);

        //Removing element
        //pop
        while (!s.isEmpty()) 
        {
           System.out.println(s.pop());
        }

        System.out.println("stack after removing elements : "+ s);
        
        
    }
    
}
