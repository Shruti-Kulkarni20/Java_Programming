package JavaConceptual;

public class StaticMethod 
{
    //static variable
    static int a = 40;

    int b = 50;

    void Display()
    {
        System.out.println(a); //we can access static data from non static method
        System.out.println(b);
    }

    //static method
    static void staticDisplay()
    {
         System.out.println(a);
    }

    public static void main(String[] args) 
    {
       StaticMethod sobj =new StaticMethod();
       sobj.Display();
       
       //calling staic method
       staticDisplay();
    }
    
}
