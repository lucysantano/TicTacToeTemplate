package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by lsantano on 9/24/15.
 */
public class PlayerTurn {
    private PrintStream printStream;
    private BufferedReader reader;

    public PlayerTurn(PrintStream printStream, BufferedReader reader) {
        this.printStream = printStream;
        this.reader = reader;
    }

    public String promptSelection(){
        printStream.println("Please enter a position number between 1 and 9:");
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    public void placePlayersSymbol(String position) {

    }
}
