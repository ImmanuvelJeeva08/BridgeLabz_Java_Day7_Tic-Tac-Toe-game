/************************************************************************************************************************************************************************
 *
 * As player would expect the Tic-Tac-Toe app to determine after every move the Winner or the Tie or change the Turn
 *
 * @author : Immanuvel Jeeva
 * @since  : 19-07-2021
 *
 ***********************************************************************************************************************************************************************/
package game;

public class Uc7 {

    public static void player1 (Encap encap,char[] board) {
        Uc3.showboard(board);

        Uc5.playerPosition(encap.getInputchoice1(), board);

        //Check to see if either player has won
        if (playerHasWon(board) == 'O') {
            System.out.println("\nUser wins!");
        } else if (playerHasWon(board) == 'X') {
            System.out.println("\nUser wins!");
        }
        else {
            //If neither player has won, check to see if there has been a tie (if the board is full)
            if (Uc8.boardIsFull(board)) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("\nChange turn to Computer");
                    player2(encap,board);

            }
        }
    }
    public static void player2 (Encap encap,char[] board) {
        Uc3.showboard(board);

        Uc5.playerPosition(encap.getInputchoice2(), board);

        //Check to see if either player has won
        if (playerHasWon(board) == 'O') {
            System.out.println("\nComputer wins!");
        } else if (playerHasWon(board) == 'X') {
            System.out.println("\nComputer wins!");
        }
        else {
            //If neither player has won, check to see if there has been a tie (if the board is full)
            if (Uc8.boardIsFull(board)) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("\nChange turn to User");
                    player1(encap,board);

            }
        }
    }


    public static char playerHasWon(char[] board) {

        for (int i = 1; i < 9; i++) {

            //Check for rows
            if(board[1] == board[2] && board[2] == board[3] && board[1] != '-' && board[2] != '-' && board[3] != '-')
                return board[i];
            if(board[4] == board[5] && board[5] == board[6] && board[4] != '-' && board[5] != '-' && board[6] != '-')
                return board[i];
            if(board[7] == board[8] && board[8] == board[9] && board[7] != '-' && board[8] != '-' && board[9] != '-')
                return board[i];

            //Check for columns
            if(board[1] == board[4] && board[4] == board[7] && board[1] != '-' && board[4] != '-' && board[7] != '-')
                return board[i];
            if(board[2] == board[5] && board[5] == board[8] && board[2] != '-' && board[5] != '-' && board[8] != '-')
                return board[i];
            if(board[3] == board[6] && board[6] == board[9] && board[3] != '-' && board[6] != '-' && board[9] != '-')
                return board[i];

            //Check for diagonals
            if(board[1] == board[5] && board[5] == board[9] && board[1] != '-' && board[5] != '-' && board[9] != '-')
                return board[i];
            if(board[3] == board[5] && board[5] == board[7] && board[3] != '-' && board[5] != '-' && board[7] != '-')
                return board[i];
        }
        return '-';
    }
}
