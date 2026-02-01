import java.util.Random;
import java.util.Scanner;

public class Minesweepergame {

    static final int SIZE = 9;
    static final int MINES = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] map = new char[SIZE][SIZE];
        char[][] board = new char[SIZE][SIZE];

        generateMap(map);
        initBoard(board);

        boolean gameOver = false;

        while (!gameOver) {
            clearScreen();
            printBoard(board);

           System.out.println("\nCommands:");
           System.out.println("  r row col  -> reveal a tile (example: r 2 3)");
           System.out.println("  f row col  -> flag or unflag a tile (example: f 4 5)");
           System.out.println("  q          -> quit the game");
           System.out.print("Enter command: ");
            String command = input.next();

            if (command.equalsIgnoreCase("q")) {
                break;
            }

            int row = input.nextInt();
            int col = input.nextInt();

            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                continue;
            }

            if (command.equalsIgnoreCase("f")) {
                if (board[row][col] == '#') {
                    board[row][col] = 'f';
                } else if (board[row][col] == 'f') {
                    board[row][col] = '#';
                }
            }

            if (command.equalsIgnoreCase("r")) {
                if (map[row][col] == 'm') {
                    board[row][col] = 'm';
                    clearScreen();
                    printBoard(board);
                    System.out.println("\nGame Over: You hit a mine!");
                    gameOver = true;
                } else {
                    board[row][col] = map[row][col];
                }
            }

            if (checkWin(board, map)) {
                clearScreen();
                printBoard(board);
                System.out.println("\nYou win: All safe tiles revealed!");
                gameOver = true;
            }
        }

        input.close();
    }

    // Methonds

    public static void generateMap(char[][] map) {
        Random rand = new Random();

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                map[r][c] = ' ';
            }
        }

        int placed = 0;
        while (placed < MINES) {
            int r = rand.nextInt(SIZE);
            int c = rand.nextInt(SIZE);
            if (map[r][c] != 'm') {
                map[r][c] = 'm';
                placed++;
            }
        }

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (map[r][c] != 'm') {
                    int count = countAdjacentMines(map, r, c);
                    if (count > 0) {
                        map[r][c] = (char) ('0' + count);
                    }
                }
            }
        }
    }

    public static int countAdjacentMines(char[][] map, int row, int col) {
        int count = 0;

        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (r >= 0 && r < SIZE && c >= 0 && c < SIZE) {
                    if (map[r][c] == 'm') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void initBoard(char[][] board) {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                board[r][c] = '#';
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.print("  ");
        for (int c = 0; c < SIZE; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (int r = 0; r < SIZE; r++) {
            System.out.print(r + " ");
            for (int c = 0; c < SIZE; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkWin(char[][] board, char[][] map) {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (map[r][c] != 'm' && board[r][c] == '#') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}