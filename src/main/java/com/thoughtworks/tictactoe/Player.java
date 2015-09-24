package com.thoughtworks.tictactoe;

/**
 * Created by lsantano on 9/24/15.
 */
public class Player {

    private PlayerTurn playerTurn;
    private TicTacToeBoard ticTacToeBoard;
    private String playerSymbol;

    public Player(PlayerTurn playerTurn, TicTacToeBoard ticTacToeBoard, String playerSymbol) {

        this.playerTurn = playerTurn;
        this.ticTacToeBoard = ticTacToeBoard;
        this.playerSymbol = playerSymbol;
    }

    public void createPlayer() {
    }

    public void startTurn() {
        String position = playerTurn.promptSelection();
        ticTacToeBoard.updateBoard(position, playerSymbol);
    }

    public int totalNumberOfPositions() {
        return 0;
    }
}
