/**************************************************************************************************************************************************************************
 ****************************** As a player would like to see the Board So I can choose the valid cells to make my move during my Turn ************************************
 *
 * @author : Immanuvel Jeeva
 * @since  : 19-07-2021
 *
 *************************************************************************************************************************************************************************/
package game;

public class Uc3 {

    // To display the current Board
    public static void showboard(char[] board) {
        System.out.println("\n" + "Displaying the Tic Tac Toe Board");
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("__________");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("__________");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
}
