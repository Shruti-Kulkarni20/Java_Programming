package JavaConceptual;

public class Loops 
{
    public static void main(String[] args) 
    {
        //For loop
        System.out.println("For Loop:");
        for(int i = 0;i < 5;i++)
        {
            System.out.println("i = "+i);
        }

        //While loop
        System.out.println("\nwhile loop:");
        int j = 0;
        while (j < 5) 
        {
           System.out.println("j = "+j); 
           j++;
        }

        //do-while
        System.out.println("\nDo while loop");
        int k = 0;
        do
        {
            System.out.println("k = "+k);
            k++;
        }while(k < 5);

        //For-each loop
        System.out.println("\nFor each loop");
        int[] no = {10,20,30,40,50};
        for(int i : no)
        {
             System.out.println("no = "+i);
        }
    }
    
}
