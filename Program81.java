//Palindrom string 

public class Program81 
{
    public static void main(String[] args) 
    {
        String str = "madam";
        String  rev = "";

        for(int i = str.length()-1;i >= 0;i--)
        {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev))
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not Palindrom");
        }
        
    }
    
}
