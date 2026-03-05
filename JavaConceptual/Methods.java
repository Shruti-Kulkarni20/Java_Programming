package JavaConceptual;

//methods
public class Methods 
{
    //method instance
    public void greet()
    {
         System.out.println("Hello,GM!!");
    }
    public static void main(String[] args) 
    {
      //creating instance of the class containg method
      Methods mobj = new Methods();
        
      //calling the method
      mobj.greet();
    }
    
}
