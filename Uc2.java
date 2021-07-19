/******************************************************************************************************************
 **************************** Ability to allow the player to choose a letter X or O *******************************
 *
 * @author : Immanuvel Jeeva
 * @since  : 19-07-2021
 *
 ******************************************************************************************************************/
package game;

import java.util.Scanner;

public class Uc2 {

    static Scanner input = new Scanner(System.in);

    // Using method get input from the User
    public static char chooseLetter() {
        System.out.println("\n" + "Enter your choice: X | O");
        char choice = input.next().charAt(0);

        return choice;
    }

}
