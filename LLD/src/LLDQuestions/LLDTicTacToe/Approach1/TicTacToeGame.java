package LLDQuestions.LLDTicTacToe.Approach1;

import LLDQuestions.LLDTicTacToe.Approach1.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    // Tic-Tac-Toe game 'has' players and a board
    // so we initialize them first
    Deque<Player> players;
    Board gameBoard;

    TicTacToeGame() {
        initializeGame();
    }

    public void initializeGame() {
        // creating 2 players
        players = new LinkedList<>();

        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Alice1", crossPiece);

        PlayingPieceO noughtPiece = new PlayingPieceO();
        Player player2 = new Player("Bob2", noughtPiece);

        players.add(player1);
        players.add(player2);
        // Deque list -> player1, player2

        // initializing board
        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        // game will go on until we get a winner, i.e., noWinner becomes false
        while(noWinner) {
            // take out the player whose turn is on and also put the player in the list back after its turn
            Player playerTurn = players.removeFirst();

            // get the free space from the board
            gameBoard.printBoard();
            List<Pair<Integer,Integer>> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            // read the user input
            System.out.print("Player: " + playerTurn.getName() + ", Enter row, column to put your playing piece: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // placing the playing piece
            boolean isPlayingPieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.getPlayerPlayingPiece());
            if(!isPlayingPieceAddedSuccessfully) {
                // player can not insert the piece into this cell, player has to choose another cell
                // because other player has already added its piece there
                System.out.println("Incorrect position chosen. Please try again!");
                players.addFirst(playerTurn);
                continue;
            }
            // current players' turn is done, and it will sit at the end till its turn for next time
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPlayerPlayingPiece().piecetype);
            if (winner) {
                return playerTurn.getName();
            }
        }
        return "Game is tied";
    }

    // winner deciding function
    public boolean isThereWinner(int row, int col, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // checking in row
        // basically checking if the cells in that particular row in which the piece is added by the playerturn's current piecetype
        // that should match with cells of all the columns of that row
        // if not, then return false
        for(int i=0; i< gameBoard.size; i++) {
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].piecetype != pieceType) {
                rowMatch = false;
            }
        }

        // checking in column
        for(int i=0; i<gameBoard.size; i++) {
            if(gameBoard.board[i][col] == null || gameBoard.board[i][col].piecetype != pieceType) {
                columnMatch = false;
            }
        }

        // checking in diagonal
        for(int i=0,j=0; i<gameBoard.size; i++,j++) {
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].piecetype != pieceType) {
                diagonalMatch = false;
            }
        }

        // checking in anti-diagonal
        for(int i=0,j= gameBoard.size-1; i<gameBoard.size; i++,j--) {
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].piecetype != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
