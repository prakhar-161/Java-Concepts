package LLDQuestions.LLDTicTacToe.Approach1.Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;      // since board can store values of type PlayingPiece in a n*n dim array

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if(board[row][col] != null) {
            return false;       // piece can not be added at that position as it is already added
        }
        board[row][col] = playingPiece;     // playing piece added at row, col
        return true;
    }

    public List<Pair<Integer,Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(board[i][j] == null) {
                    Pair<Integer, Integer> rowCol = new Pair<>(i, j);
                    freeCells.add(rowCol);
                }
            }
        }

        return freeCells;
    }

    public void printBoard() {
        for (int i=0; i<size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].piecetype.name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
