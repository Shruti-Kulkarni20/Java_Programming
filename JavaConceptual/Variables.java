package JavaConceptual;

public class Variables 
{
    //Instance Variable
    int i = 10;

    //static variable
    static int j = 30;

    public void showVar()
    {
        //Local variable
        int Local = 5;

        System.out.println("Instance Variable: " + i);
        System.out.println("Static Variable: " + j);
        System.out.println("Local Variable: " + Local);

    }

    public static void main(String[] args) 
    {
        Variables vobj = new Variables();
        vobj.showVar();
        
        //Accessing static by using class name
        System.out.println("Static variable : "+Variables.j);
    }
    
}
