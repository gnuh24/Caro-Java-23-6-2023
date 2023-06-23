package Elements;
import Elements.User;
import Elements.Board;
import java.util.ArrayList;
public class Game{
    Board board1;
    public Game(Board board1){
        this.board1 = board1;
    }
    public void gamePlay(){
        boolean flag = true;
        boolean player = true;
        User player1 = new User("Hưng", "X");
        User player2 = new User("Tài", "O");

        this.board1.createBoard();
        System.out.println("Trò chơi đã được thiết lập");
        this.board1.display();


        while(flag){
            if (player)
                player1.userAnswer(this.board1);
            else player2.userAnswer(this.board1);

            this.board1.display();

            if (this.board1.checkResult() == 2) {
                System.out.println(player1.name +" thắng ^^");
                flag = false;
            }
            else if (this.board1.checkResult() == 1) {
                System.out.println(player2.name +" thắng ^^");
                flag = false;
            }
            else if (this.board1.checkResult() == 3) {
                System.out.println("Hòa");
                flag = false;
            }
            else {
                player = !player;
            }


        }
    }
}