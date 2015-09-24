package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.PrintStream;

/**
 * Created by lsantano on 9/24/15.
 */
public class GameApplication {
    private PrintStream printStream;
    private Player playerOne;
    private Player playerTwo;

    public GameApplication(PrintStream printStream, Player playerOne, Player playerTwo) {
        this.printStream = printStream;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        printStream.println("   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   ");
        int[] board = {0,0,0,0,0,0,0,0,0};
        playerOne.createPlayer();
        playerTwo.createPlayer();
        playerOne.startTurn(board);
        playerTwo.startTurn(board);
    }
}
