//Acccessing the elements in collection

import java.util.ArrayList;
import java.util.List;

public class Program86 
{
    public static void main(String[] args) 
    {
        //Using List reference for index based access

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Colors List : "+colors);

        //Accessing elemnts by index
        
        String firstcolor = colors.get(0);
        String lastColor = colors.get(colors.size() - 1);


        System.out.println("First Color : "+ firstcolor);
        System.out.println("Last Color : "+ lastColor);
        
    }
    
}
