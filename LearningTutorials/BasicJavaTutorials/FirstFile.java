package LearningTutorials.BasicJavaTutorials;
import java.util.Scanner;

public class FirstFile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter input to start:");
        String read = input.nextLine();


        input.close();
    }
}
