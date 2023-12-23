package LearningTutorials.BasicJavaTutorials;

public class WrapperClasses {

    //Wrapper class = provides way to use primitive data types as reference data types.
    // reference data types contain useful methods 
    // and can be used with collections (EX: ArrayList).

    //Faster        Slower
    //Primitive     Wrapper
    //--------      -------
    // boolean      Boolean
    // char         Character
    // int          Integer
    // double       Double


    //autoboxing = the automatic coversion that the Java complier makes between the primitive types and their corresponding object wrapper classes.
    // unboxing = the reverse of autoboxing. Automatic coversion of wrapper class to primitive




    public static void main(String[] args) {
        //Example of autoboxing.

        Boolean male = true;
        Character symbol = '@';
        Integer num = 123;
        Double pie = 3.14;
        String name = "Joe";

        //All of these are wrapper classes and have access to methods unlike there primitive types. 

        //Primitive values are a lot faster compared to wrapper types. 

        //This is an example of unboxing. The wrapper class behaves just like its primitive type.
        if(male == true){
            System.out.println("You are male.");
        }

    }
    
}
