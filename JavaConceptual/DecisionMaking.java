package JavaConceptual;

public class DecisionMaking 
{
    public static void main(String[] args) 
    {
        int iNo = 10;

        //if statement
        if(iNo > 0)
        {
            System.out.println("The No is positive");
        }

        //if-else statement
        if(iNo % 2 == 0)
        {
             System.out.println("The No is Even");
        }
        else
        {
             System.out.println("The No is Odd");
        }


        //if-else-if statement
        if(iNo < 0)
        {
            System.out.println("Negative No");
        }
        else if(iNo == 0)
        {
            System.out.println("the No is 0");
        }
        else
        {
            System.out.println("Positive No");
        }

        //switch statement
        int day = 1;
        switch (day) 
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                 System.out.println("Tuesday");
                 break;
            case 3:
                 System.out.println("wednseday");
                 break;
            default:
                  System.out.println("Other day");
                break;
        }
        
    }
    
}
