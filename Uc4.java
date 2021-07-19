/***********************************************************************************************************************
 *************************** Ability for User to make a move to a desired location in the board ************************
 ************************************* Select the index from 1 to 9 to make the move ***********************************
 ********************************************** Ensure the index is Free ***********************************************
 *
 *  @author : Immanuvel Jeeva
 *  @since  : 19-07-2021
 *
 **********************************************************************************************************************/
package game;

import java.util.Scanner;

public class Uc4 {

    static Scanner input = new Scanner(System.in);

    //Ask to user for what position they want to place their X or O
    public static void playerPosition(char inputCharUser, char[] board) {
        System.out.print("Enter the position you want to enter the value:  ");
        int position = input.nextInt();

        //Check if the postion does not exceed
        if(position < 1 || position > 9)
            System.out.println("This position is out of the bounds of the board");
            //Check if the position on the board the user entered is empty or not
        else if(board[position] != '-')
            System.out.println("Someone has already made a move at this position" + "\n");
        else
            board[position] = inputCharUser;
    }
}
