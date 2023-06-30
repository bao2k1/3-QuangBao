package Day3.Bai7;

import java.util.Scanner;

// Lớp Game đại diện cho trò chơi
class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Player currentPlayer;

    public Game(String name1, String name2) {
        player1 = new Player(name1, 'X');
        player2 = new Player(name2, 'O');
        board = new Board(3);
        currentPlayer = player1;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Current player: " + currentPlayer.getName());
            System.out.print("Enter row (0-" + (board.getSize() - 1) + "): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-" + (board.getSize() - 1) + "): ");
            int col = scanner.nextInt();

            if (board.placeMark(row, col, currentPlayer.getMark())) {
                board.printBoard();

                if (board.checkWin(currentPlayer.getMark())) {
                    System.out.println("Congratulations, " + currentPlayer.getName() + " wins!");
                    break;
                } else if (board.isFull()) {
                    System.out.println("It's a draw!");
                    break;
                }

                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }

        scanner.close();
    }
}