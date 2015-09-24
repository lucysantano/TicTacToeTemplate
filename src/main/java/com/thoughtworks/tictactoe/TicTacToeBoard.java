package com.thoughtworks.tictactoe;

import java.io.PrintStream;

/**
 * Created by lsantano on 9/24/15.
 */
public class TicTacToeBoard {
    private PrintStream printStream;

    public TicTacToeBoard(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void updateBoard(String symbolPosition, String playerSymbol) {
        int currentPosition = 1;
        String board = "";
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(currentPosition == Integer.parseInt(symbolPosition)){
                    board+=" "+playerSymbol+" ";
                }
                else{
                    board+="   ";
                }
                if(j!=2)
                    board+="|";
                currentPosition++;
            }
            if(i!=2)
                board+="\n-----------\n";

        }
        printStream.println(board);
    }
}
