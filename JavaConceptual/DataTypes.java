package JavaConceptual;

public class DataTypes 
{
    public static void main(String A[])
    {
        //Primitive 

        byte b = 100;  //1 byte
        short s = 30000; //2 byte
        int i = 10000000; //4 byte
        long l = 100000000L;  //8byte

        float f = 3.14f;  //4 byte 
        double d = 3.142324567843435;  //8 byte

        char c = 'A';  //2 bytes (Unicode character)
        boolean flag = true; // 1bit

        //Non primitive 

        String str = "Hello java"; //String class

        int[] arr = {1,2,3,4,5};  //Array

        Integer wrapperInt = Integer.valueOf(50);  //Wrapper class

        StringBuilder sb = new StringBuilder("java"); //class Object

         // -------- Output --------
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("String : "+str);
        System.out.print("Arrays : ");
        for(int num: arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("StringBuilder: " + sb);
    }

    
}
