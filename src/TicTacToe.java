
import java.util.Scanner;

public class TicTacToe {
    
    public static String[][] board = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };

    public static void showBoard(String player, int row, int column) {
        board[row][column] = player;

        for (int i = 0; i < board.length; i++) {
            for (int o = 0; o < 3; o++) {
                System.out.print("[" + board[i][o] + "]"); // shows the current state of the board
            }
            System.out.println();
        }
    }

    public static void winChecker(String player, double turn) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]) && !board[i][0].equals(" ")) {
                System.out.println(player + " has won the game"); // checks for any column wins
                System.exit(0);
            } else if (board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i]) && !board[0][i].equals(" ")) {
                System.out.println(player + " has won the game"); // checks for any row wins
                System.exit(0);
            }
        }

        if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && !board[0][0].equals(" ")) {
            System.out.println(player + " has won the game"); // checks for diagonal win from top left to bottom right
            System.exit(0);
        } else if (board[2][0].equals(board[1][1]) && board[2][0].equals(board[0][2]) && !board[2][0].equals(" ")) {
            System.out.println(player + " has won the game"); // checks for diagonal win from bottom left to top right
            System.exit(0);
        } else if (turn == 9) {
            System.out.println("The game is a Tie!");
            System.exit(0);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("The game you are playing is Tic Tac Toe");
        System.out.println("This is a two player game where you can control both player X and O");
        System.out.println("The rows are labeled 0, 1, 2 from top to bottom");
        System.out.println("The columns labeled 0, 1, 2 from left to right");
        System.out.println("Make sure to seperate your row and column with a space");

        for (int i = 0; i <= 9; i++) // main game code
            try {
                if (i == 9) {
                    winChecker("Player X", i);
                } else if ((i % 2 == 0)) {
                    System.out.println("You are player X! Where do you want to go (row)(column)");
                    String[] choice = keyboard.nextLine().split(" ");

                    if ((board[Integer.parseInt(choice[0])][Integer.parseInt(choice[1])] == " ")) {
                        showBoard("X", Integer.parseInt(choice[0]), Integer.parseInt(choice[1]));
                        winChecker("Player X", i);
                    } else {
                        System.out.println("invalid option choose another one (space is already taken)");
                        i--;
                    }
                } else {
                    System.out.println("You are player O! Where do you want to go (row)(column)");
                    String[] choice = keyboard.nextLine().split(" ");

                    if ((board[Integer.parseInt(choice[0])][Integer.parseInt(choice[1])] == " ")) {
                        showBoard("O", Integer.parseInt(choice[0]), Integer.parseInt(choice[1]));
                        winChecker("Player O", i);
                    } else {
                        System.out.println("invalid option choose another one (space is already taken)");
                        i--;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException Exception) {
                System.out.println("invalid option choose another one (Make sure your choice is in the grid)");
                i--;
            } catch (java.lang.NumberFormatException Exception) {
                System.out.println(
                        "invalid option choose another one (Make sure your choice doesn't have letters in it)");
                i--;
            }
        keyboard.close();
    }
} //done