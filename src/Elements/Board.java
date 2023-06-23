package Elements;
import java.util.ArrayList;
public class Board{
    ArrayList <String> boardGame = new ArrayList <> ();

    public void createBoard(){
        for (int i=0; i<9; i++)
            this.boardGame.add(" ");
    }
    public void display(){
        System.out.println( this.boardGame.get(0) + " | " + this.boardGame.get(1) + " | " + this.boardGame.get(2) ) ;
        System.out.println( "- + - + -");
        System.out.println( this.boardGame.get(3) + " | " + this.boardGame.get(4) + " | " + this.boardGame.get(5) ) ;
        System.out.println( "- + - + -");
        System.out.println( this.boardGame.get(6) + " | " + this.boardGame.get(7) + " | " + this.boardGame.get(8) ) ;

    }

    public int checkResult(){
        int result = 0;
        if (this.boardGame.get(0).equals("O") && this.boardGame.get(1).equals("O") && this.boardGame.get(2).equals("O"))
            result = 1;
        else if (this.boardGame.get(3).equals("O") && this.boardGame.get(4).equals("O") && this.boardGame.get(5).equals("O"))
            result = 1;
        else if (this.boardGame.get(6).equals("O") && this.boardGame.get(7).equals("O") && this.boardGame.get(8).equals("O"))
            result = 1;

        else if (this.boardGame.get(0).equals("O") && this.boardGame.get(3).equals("O") && this.boardGame.get(6).equals("O"))
            result = 1;
        else if (this.boardGame.get(1).equals("O") && this.boardGame.get(4).equals("O") && this.boardGame.get(7).equals("O"))
            result = 1;
        else if (this.boardGame.get(2).equals("O") && this.boardGame.get(5).equals("O") && this.boardGame.get(8).equals("O"))
            result = 1;

        else if (this.boardGame.get(0).equals("O") && this.boardGame.get(4).equals("O") && this.boardGame.get(8).equals("O"))
            result = 1;
        else if (this.boardGame.get(6).equals("O") && this.boardGame.get(4).equals("O") && this.boardGame.get(2).equals("O"))
            result = 1;

        //
        else if (this.boardGame.get(0).equals("X") && this.boardGame.get(1).equals("X") && this.boardGame.get(2).equals("X"))
            result = 2;
        else if (this.boardGame.get(3).equals("X") && this.boardGame.get(4).equals("X") && this.boardGame.get(5).equals("X"))
            result = 2;
        else if (this.boardGame.get(6).equals("X") && this.boardGame.get(7).equals("X") && this.boardGame.get(8).equals("X"))
            result = 2;

        else if (this.boardGame.get(0).equals("X") && this.boardGame.get(3).equals("X") && this.boardGame.get(6).equals("X"))
            result = 2;
        else if (this.boardGame.get(1).equals("X") && this.boardGame.get(4).equals("X") && this.boardGame.get(7).equals("X"))
            result = 2;
        else if (this.boardGame.get(2).equals("X") && this.boardGame.get(5).equals("X") && this.boardGame.get(8).equals("X"))
            result = 2;

        else if (this.boardGame.get(0).equals("X") && this.boardGame.get(4).equals("X") && this.boardGame.get(8).equals("X"))
            result = 2;
        else if (this.boardGame.get(6).equals("X") && this.boardGame.get(4).equals("X") && this.boardGame.get(2).equals("X"))
            result = 2;
        boolean checkDraw = true;
        for (int i=0; i<9; i++){
            if ( this.boardGame.get(i).equals(" ")){
                checkDraw = false;
                break;

            }
        }
        if (checkDraw)
            result = 3;

        return result;
    }
}