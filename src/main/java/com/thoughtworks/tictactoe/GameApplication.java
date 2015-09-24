package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.PrintStream;

/**
 * Created by lsantano on 9/24/15.
 */
public class GameApplication {
    private PrintStream printStream;

    public GameApplication(PrintStream printStream, BufferedReader reader) {
        this.printStream = printStream;
    }

    public void start() {
        printStream.println("   |   |   \n" +
                            "-----------\n" +
                            "   |   |   \n" +
                            "-----------\n" +
                            "   |   |   ");

    }

    public void playerTurn() {
        printStream.println("Please enter a position number between 1 and 9:");
    }
}
