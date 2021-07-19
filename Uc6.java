/*************************************************************************************************************************************************************************
 ************************************************* As a User Would like to to do a toss to Check Who Plays First *********************************************************
 ********************************************************* Use Random Function to determine Head or Tail *****************************************************************
 ************************************************ Based on the Toss , Who Starts first , the computer or the User ********************************************************
 *
 * @author : Immanuvel Jeeva
 * @since  : 19-07-2021
 *
 ************************************************************************************************************************************************************************/
package game;

import java.util.Scanner;

public class Uc6 {

    static Scanner input = new Scanner(System.in);

    // Using toss to check who plays first
    public static String whoPlaysFirst() {
        int randomNumber = (int) Math.floor(Math.random() * 10) % 2;
        String player = "";

        if(randomNumber == 1)
            player = "User";
        else
            player = "Computer";

        System.out.println("\n" + player + " starts first.");

        return player;
    }
}
