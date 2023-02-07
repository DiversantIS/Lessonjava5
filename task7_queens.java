import java.util.Arrays;

public class Main {
     
    private static int SIZE = 8;
    public static int[][] board = new int[SIZE][SIZE];
    private static int results_count = 0;
 
    // show board
    public static void showBoard() {
        for (int a = 0; a < SIZE; ++a) {
            for (int b = 0; b < SIZE; ++b) {
                System.out.print((board[a][b] == 1) ? "Q " : ". ");
            }
            System.out.println();
        }
    }
 
    // check for queens
    public static boolean tryQueen(int a, int b) {
        //vertical
        for (int i = 0; i < SIZE; ++i) {
            if (board[i][b] == 1 && a != i) {
                return false;
            }
        }
 
        //horizontal
        for (int i = 0; i < SIZE; ++i) {
            if (board[a][i] == 1 && i != b) {
                return false;
            }
        }
 
        //diagonal
        for (int i = 1; i <= a && b - i >= 0; ++i) {
            if (board[a - i][b - i] == 1) {
                return false;
            }
        }
 
        //diagonal
        for (int i = 1; i <= a && b + i < SIZE; i++) {
            if (board[a - i][b + i] == 1) {
                return false;
            }
        }
 
        return true;
    }
 
    // setQueen
    public static void setQueen(int a) {
        if (a == SIZE) {
            System.out.println("Result #" + ++results_count);
            System.out.println();
            showBoard();
            return;
        }
 
        for (int i = 0; i < SIZE; ++i) {
            if (tryQueen(a, i)) {
                board[a][i] = 1;
                setQueen(a + 1);
                board[a][i] = 0;
            }
        }
        return;
    }
 
    public static void main(String[] args) {
        for (int[] row : board) {
            Arrays.fill(row, 0);
        }
 
        setQueen(0);
    }
}