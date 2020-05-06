package pl.orlowski.sebastian.samouczekjava.a03Tablice;

public class brudnopis {
    public static void main(String[] args) {
    }


    public void week() {
        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "poniedziałek";
        daysOfWeek[1] = "wtorek";
        daysOfWeek[2] = "środa";
        daysOfWeek[3] = "czwartek";
        daysOfWeek[4] = "piątek";
        daysOfWeek[5] = "sobota";
        daysOfWeek[6] = "niedziela";
    }

    public void ticTac() {
        int[][] ticTacToeBoard = new int[3][3];
        ticTacToeBoard[0] = new int[3];
        ticTacToeBoard[1] = new int[3];
        ticTacToeBoard[2] = new int[3];
    }
}
