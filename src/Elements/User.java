package Elements;

import java.util.ArrayList;
import java.util.Scanner;
import  Elements.Board;

public class User{
    String name;
    String symbol;

    User(String name, String symbol){
        this.name = name;
        this.symbol = symbol;
    }
    private static boolean checkAnswer(ArrayList <String> list, int answer){
        return list.get(answer).equals(" ") ? true: false;

    }
    public void userAnswer(Board list){
        Scanner input = new Scanner(System.in);

        System.out.println("Mời "+ this.name + " chọn ");
        int answer  = input.nextInt();

        while (answer < 1 || answer > 9 || !User.checkAnswer(list.boardGame , answer-1)  ) {
            System.out.println("Bạn không được nhập vào  những ô không tồn tại !!");
            answer = input.nextInt();
        }
        list.boardGame.set(answer-1, this.symbol);


    }


}
