package pl.orlowski.sebastian.samouczekjava.a03Tablice;

import java.util.Arrays;

// Jak przechowałbyś stan sudoku? Napisz program, który stworzy instancje tablicy służących do przechowywania sudoku i uzupełnij ją przykładową planszą.
public class Sudoku {
    private Integer[][] board;
    public static void main(String[] args) {
        Sudoku sudoku = exampleBoard();
        System.out.println(Arrays.deepToString(sudoku.board));
    }
    public Sudoku(Integer[][] board) {
        this.board = board;
    }

    public static Sudoku exampleBoard() {
        Integer[][] sud = new Integer[][]{
                new Integer[]{1, null, null, 4, 8, null, null, null, 2},
                new Integer[]{null, 3, null, null, 2, null, null, 9, null},
                new Integer[]{4, null, 8, null, null, null, null, null, 1},
                new Integer[]{null, 1, null, null, null, null, 7, null, null},
                new Integer[]{null, null, 3, null, null, null, null, 2, null },
                new Integer[]{2, null, null, null, 9, 1, null, null, null},
                new Integer[]{null, 6, null, 9, 1, null, 4, null, null},
                new Integer[]{null, null, null, 6, null, null, null, 3, 8},
                new Integer[]{null, 2, null, null, null, null, null, null,5}

        };
        return new Sudoku(sud);

    }
}
