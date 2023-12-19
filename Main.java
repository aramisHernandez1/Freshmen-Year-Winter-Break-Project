import java.util.Scanner;

public class Main {
    //Main game input    
    private static Scanner gameInput = new Scanner(System.in);


    public static void main(String[] args){
        GameStart(gameInput);
        System.out.println("Game started!");

        Player player1 = CharacterCreation();
    }


    //Game start method
    private static void GameStart(Scanner input){
    System.out.println("Welcome to My Game" + "\n----------------------------------");
    System.out.print("Please enter to start: ");


    input.nextLine();

    }

    private static Player CharacterCreation(){
        System.out.println("Welcome to the Character Creation.");
        System.out.print("Please Enter Your Character Name: ");

        String player_name = gameInput.nextLine();

        Player character = new Player(player_name);

        return character;
    }


    
}
