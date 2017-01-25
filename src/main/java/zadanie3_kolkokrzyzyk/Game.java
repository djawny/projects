package zadanie3_kolkokrzyzyk;

import zadanie4_przeslanianie_kolekcje_zbiory_listy_mapy_wyjatki.IllegalFieldException;

import java.util.Scanner;

public class Game {
    private GameLogic gameLogic;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private GameBoard gameBoard;

    Game() {
        gameBoard = new GameBoard();
        gameLogic = new GameLogic();
    }

    public void start() {
        createPlayers();

        while (true) {
            readAndPerformMove();
            displayBoard();

            if (gameLogic.checkWinCondition(gameBoard)) {
                System.out.println("Gra skończona, WYGRANA");
                break;
            }
        }

    }

    private void displayBoard() {
        System.out.println(gameBoard);
    }

    private void readAndPerformMove() {
        String move;
//        do {
//            System.out.println("Podaj ruch gracza " + currentPlayer.getMark() + " (" + currentPlayer.getName() + ") : ");
//            move = new Scanner(System.in).nextLine();
//        } while (!gameBoard.setMark(move, currentPlayer.getMark()));

        boolean shouldRetry = false;
        do {
            System.out.println("Podaj ruch gracza " + currentPlayer.getMark() + " (" + currentPlayer.getName() + ") : ");
            move = new Scanner(System.in).nextLine();

            try {
                if (gameBoard.setMark(move, currentPlayer.getMark())) {
                    shouldRetry = false;
                } else {
                    shouldRetry = true;
                }

                shouldRetry = !gameBoard.setMark(move, currentPlayer.getMark());
            } catch (IllegalFieldException e) {
                System.out.println(e.getFieldName());
                shouldRetry = true;
            }

        } while (shouldRetry);

        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    private void createPlayers() {
        player1 = createPlayer(Mark.TIC);
        player2 = createPlayer(Mark.TOE);
        currentPlayer = player1;
    }

    private Player createPlayer(Mark mark) {
        System.out.println("Podaj imię gracza " + mark.getCharMark());
        String playerName = new Scanner(System.in).nextLine();
        Player player = new Player(playerName, mark);
        System.out.println("Stworzono gracza: " + player);
        return player;
    }
}
