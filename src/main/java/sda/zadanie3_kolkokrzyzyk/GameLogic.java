package sda.zadanie3_kolkokrzyzyk;

public class GameLogic {
    public boolean checkWinCondition(GameBoard gameBoard) {
        Mark[][] board = gameBoard.getBoard();

        if (checkRowForWinning(board[0])) {
            return true;
        }
        if (checkRowForWinning(board[1])) {
            return true;
        }
        if (checkRowForWinning(board[2])) {
            return true;
        }

        if (checkColumnForWinning(board, 0)) {
            return true;
        }
        if (checkColumnForWinning(board, 1)) {
            return true;
        }
        if (checkColumnForWinning(board, 2)) {
            return true;
        }
        if (checkDiagonals(board)) {
            return true;
        }

        return false;
    }

    private boolean checkRowForWinning(Mark[] marks) {
        return (marks[0] == Mark.TIC
                && marks[1] == Mark.TIC
                && marks[2] == Mark.TIC)
                || (marks[0] == Mark.TOE
                && marks[1] == Mark.TOE
                && marks[2] == Mark.TOE);
    }

    private boolean checkColumnForWinning(Mark[][] board, int columnIndex) {
        return (board[0][columnIndex] == Mark.TIC
                && board[1][columnIndex] == Mark.TIC
                && board[2][columnIndex] == Mark.TIC)
                || (board[0][columnIndex] == Mark.TOE
                && board[1][columnIndex] == Mark.TOE
                && board[2][columnIndex] == Mark.TOE);
    }

    private boolean checkDiagonals(Mark[][] board) {
        return (board[0][0] == Mark.TIC
                && board[1][1] == Mark.TIC
                && board[2][2] == Mark.TIC)
                || (board[0][0] == Mark.TOE
                && board[1][1] == Mark.TOE
                && board[2][2] == Mark.TOE)
                || (board[0][2] == Mark.TOE
                && board[1][1] == Mark.TOE
                && board[2][0] == Mark.TOE)
                || (board[0][2] == Mark.TIC
                && board[1][1] == Mark.TIC
                && board[2][0] == Mark.TIC);
    }
}
