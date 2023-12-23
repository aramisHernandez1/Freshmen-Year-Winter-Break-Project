package LearningTutorials.BasicJavaTutorials;

public class PrintFExample {
    public static void main(String[] args) {
        //printf() = way to format print statments
        // two arugments = format string + object/variable/value
        // % [flags] [precision] [width] [conversion-character]


        //Conversion character = letter affter %
        //Letter corresponds with datatype

        System.out.printf("Hello your %d years old", 10);


        boolean myBool = true;
        char symbol = '@';
        String myString = "Aj0";
        int myInt = 10;
        double myDouble = 1000;

        //All conversion characters for basic data types.
        System.out.printf("%b", myBool); //Boolean 
        System.out.printf("%c", symbol); //Char 
        System.out.printf("%s", myString); //String 
        System.out.printf("%d", myInt); //Integer 
        System.out.printf("%f", myDouble); //Double 


        //[width]
        //minimum number of characters to be written as output
        System.out.printf("Hello %10s", myString); //the number before conversion char = the width (adds white space)

        //[precision]
        //limit the amount of digits to display
        System.out.println();
        System.out.printf("You have %.1f Money", myDouble);//. num = the number of digits to display.


        //[flags]
        //adds an effect to output based on the flag added to format specifier
        // -: left-justify starts from left side.
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000 (EX: 1,000,000)



    }
}
