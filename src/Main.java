import Elements.Board;
import Elements.Game;

public class Main {
    public static void main(String[] args)
    {
        Board boardGame = new Board ();
        Game game1 = new Game(boardGame);
        game1.gamePlay();
    }
}