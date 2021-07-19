/************************************************************************************************************************************************************************
 * Make the variables as private and accees those by Getter and Setter method
 * In this class achieve Encapsulation
 *
 * @author : Immanuvel Jeeva
 * @Since  : 19-07-2021
 *
 ***********************************************************************************************************************************************************************/
package game;

public class Encap {
    private String user1;
    private String user2;

    private char inputchoice1;
    private char inputchoice2;

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }

    public char getInputchoice1() {
        return inputchoice1;
    }

    public void setInputchoice1(char inputchoice1) {
        this.inputchoice1 = inputchoice1;
    }

    public char getInputchoice2() {
        return inputchoice2;
    }

    public void setInputchoice2(char inputchoice2) {
        this.inputchoice2 = inputchoice2;
    }

    @Override
    public String toString() {
        return "Encap{" +
                "user1='" + user1 + '\'' +
                ", user2='" + user2 + '\'' +
                ", inputchoice1=" + inputchoice1 +
                ", inputchoice2=" + inputchoice2 +
                '}';
    }
}
