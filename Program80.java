//Armstrong number
//1³ + 5³ + 3³
//= 1 + 125 + 27
//= 153


public class Program80 
{
    public static void main(String[] args) 
    {
        int num = 153;
        int Ono = num;
        int sum = 0;

        while (num != 0) 
        {
            int digit = num % 10;
            sum = sum + digit*digit*digit;
            num = num / 10;
        }

        if(sum == Ono)
        {
            System.out.println("Armstrong number");
        }
        else
        {
             System.out.println("Not Armstrong number");
        }
        
    }
    
}
