/************************************************************************************************************************************************************************
 *************************************** On computer getting its Turn Would like the computer to play like me ***********************************************************
 ************************************** Next Thing I do is check If my opponent can win then play to block it ***********************************************************
 ************************************ If neither of use are winning then my choice is Take one available Corners ********************************************************
 ************************************************* If corner not available then Take the Care ***************************************************************************
 ******************************************************** Check board is Full or Not ************************************************************************************
 ********************************************** At finally, Ask User Continue to play another Game **********************************************************************
 *
 * @author : Immanuvel Jeeva
 * @since  : 19-07-2021
 *
 ***********************************************************************************************************************************************************************/
package game;

import java.util.Scanner;

public class Uc8 {

    static Scanner input = new Scanner(System.in);

    //Check if all of the positions on the board have been filled
    public static boolean boardIsFull(char[] board) {
        for(int i = 1; i < board.length; i++) {
            if(board[i] == '-') {
                return false;
            }
        }
        return true;
    }

    // Play game from Start if user Want
    public static void anotherGame() {
        System.out.println("Play another game? Y | N");
        char option = input.next().charAt(0);

        if (option == 'Y') {
            Uc1.start();
        } else
            System.out.println("Thank You");
    }
}
