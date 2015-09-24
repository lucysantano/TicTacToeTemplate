package com.thoughtworks.tictactoe;

import java.io.PrintStream;

/**
 * Created by lsantano on 9/24/15.
 */
public class GameApplication {
    private PrintStream printStream;

    public GameApplication(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void viewBoard() {
        printStream.println("   |   |   ");

    }
}
