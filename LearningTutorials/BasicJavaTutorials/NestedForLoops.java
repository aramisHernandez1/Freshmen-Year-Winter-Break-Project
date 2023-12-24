package LearningTutorials.BasicJavaTutorials;

import java.util.Scanner;

public class NestedForLoops {

    public static void main(String[] args) {
        
        //Nested loops = a loop inside a loop.

        Scanner input = new Scanner(System.in);
        int rows;
        int colums; 
        String symbol = "";

        System.out.print("Enter # of rows: ");
        rows = input.nextInt();
        System.out.print("Enter # of colums: ");
        colums = input.nextInt();
        System.out.print("Enter the symbol to use: ");
        symbol = input.next();//Will store token until we hit enter or space.

        for(int i = 1; i <= rows; i++){//Makes the vetical rows due to the println call.
            System.out.println();
            for(int j = 1; j <= colums; j++){//Will be the amount horizontal
                System.out.print(symbol);

            }

        }

        input.close();
    }
}
