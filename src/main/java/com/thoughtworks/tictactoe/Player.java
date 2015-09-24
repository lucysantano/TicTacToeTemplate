package com.thoughtworks.tictactoe;

/**
 * Created by lsantano on 9/24/15.
 */
public class Player {

    private PlayerTurn playerTurn;
    private TicTacToeBoard ticTacToeBoard;

    public Player(PlayerTurn playerTurn, TicTacToeBoard ticTacToeBoard) {

        this.playerTurn = playerTurn;
        this.ticTacToeBoard = ticTacToeBoard;
    }

    public void createPlayer() {
    }

    public void startTurn() {
        String position = playerTurn.promptSelection();
        ticTacToeBoard.updateBoard(position);
    }

    public int totalNumberOfPositions() {
        return 0;
    }
}
