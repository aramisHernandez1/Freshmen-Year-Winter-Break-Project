package RPGProject;

public class Main {

    public static void main(String[] args){
        GameHandler handler = new GameHandler();
        handler.StartGame(true);

        Player player = new Player(null);

        if(handler.getPlayMode() == GameModes.PLAY){
            player = handler.CharacterCreation();
        }

        player.GainXP(100d);
        System.out.println("Your character is Power " + player.GetCurrentPower());
    }
}
