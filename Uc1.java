/***********************************************************************************************************************************************************************
 ************************************************************* Create a Tic-Tac-Toe Game *******************************************************************************
 ***************************************************** Craete a board and assign empty space to each element ***********************************************************
 *
 * @author : Immanuvel Jeeva
 * @since  : 19-07-2021
 *
 **********************************************************************************************************************************************************************/
package game;

import java.util.ArrayList;

public class Uc1 {

    public static void start(){
        Encap encap = new Encap();
        ArrayList<Encap> list = new ArrayList<>();

        char[] board = new char[10];
        System.out.println("Game Started");

        //Display the initial board
        for(int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        Uc3.showboard(board);  // Method call

        String player = Uc6.whoPlaysFirst();
        encap.setUser1(player);
        char inputChoice1 = Uc2.chooseLetter();
        encap.setInputchoice1(inputChoice1);
        list.add(encap);
        System.out.println(player+" has chosen " +inputChoice1);

        for (Encap i : list) {
            if("User".equals(i.getUser1())){
                char inputChoice2 = Uc2.chooseLetter();
                encap.setUser2("Computer");
                encap.setInputchoice2(inputChoice2);
                System.out.println("Computer has chosen " + inputChoice2);
            }
            if("Computer".equals(i.getUser1())){
                char inputChoice2 = Uc2.chooseLetter();
                encap.setUser2("User");
                encap.setInputchoice2(inputChoice2);
                System.out.println("User has chosen " + inputChoice2);
            }
        }

        if(player.equals("User")){
            Uc7.player1(encap,board);
        }
        else
            Uc7.player2(encap,board);
        Uc3.showboard(board);
        Uc8.anotherGame();  // Ask player continue to play another game
    }

    public static void main(String[] args) {

        //Starting the game
        start();
    }
}
