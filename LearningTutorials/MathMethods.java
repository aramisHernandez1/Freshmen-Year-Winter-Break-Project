package LearningTutorials;

import java.util.Scanner;

public class MathMethods {

    //Some basic math methods.

    public static void main(String[] args) {
        /*
        //#region Math Function examples

        double x = 3.14d; 
        double y = -10d;

        //Returns largest value passed
        //Different versions for doubles and ints.
        double z = Math.max(x, y);
        System.out.println(z);

        //Same but returns min value.
        z = Math.min(y, x);
        System.out.println(z);

        //Absolute value or |y|
        z = Math.abs(y);
        System.out.println(z);

        //Square root function or radical sign.
        z = Math.sqrt(z);
        System.out.println(z);

        //Rounds up or down like normal rounding
        z = Math.round(x);
        System.out.println(z);

        //Rounds up no matter what
        z = Math.ceil(x);
        System.out.println(z);

        //Rounds down no matter what
        z = Math.floor(x);
        System.out.println(z);
        //#endregion
        */
        
        //Hypotenuse calcation practice
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side a and b: ");
        double a = input.nextDouble();
        double b = input.nextDouble();

        double c = CalcHypotenuse(a, b);
        System.out.println("The Hypotenuse is : "+c );
        input.close();
    }

    //Small practice Create a program that gets hypotenuse of right triangel
    //Ask user for side x and y

    private static double CalcHypotenuse(double a, double b){
        //Square a and b
        a *= a;
        b *= b;

        double hypotenuse = a + b;
        hypotenuse = Math.sqrt(hypotenuse);

        return hypotenuse;

    }

    

}
