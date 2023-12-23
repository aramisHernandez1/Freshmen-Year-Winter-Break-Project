package LearningTutorials.BasicJavaTutorials;

import java.util.Scanner;

public class WhileLoops {
    
    public static void main(String[] args) {
        
        //While loop is the same as a normal while loop.

        //Creating loop till user enters name.
        Scanner input = new Scanner(System.in);
        String name = "";

        //isBlank returns true if string is empty or whitespace.
        while(name.isBlank()){
            System.out.print("Enter your name: ");
            name = input.nextLine();

        }

        //Different version of while loop.
        //This is called the do loop Example below.

        do{
            System.out.print("Enter your name: ");
            name = input.nextLine();

        }while(name.isBlank());

        //Difference between do loop and while loop is do loop will first perform the body then check for the condition
        //And the while loop will first check for the condition then do the body.

    }
}
