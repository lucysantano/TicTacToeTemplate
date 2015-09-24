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

    public int[] updateBoard(String symbolPosition, String playerSymbol, int[] previousBoard) {
        String board = "";
        String oppositeSymbol;
        if(playerSymbol.equals("X"))
            oppositeSymbol = "O";
        else
            oppositeSymbol = "X";
        int currentPosition = 1;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(previousBoard[i+3*j]==1){
                    board+=" "+oppositeSymbol+" ";
                }
                else if(currentPosition == Integer.parseInt(symbolPosition)){
                    board+=" "+playerSymbol+" ";
                    previousBoard[i+3*j]=1;
                }
                else{
                    board+="   ";
                    previousBoard[i+3*j]=0;
                }
                if(j!=2)
                    board+="|";
                currentPosition++;
            }
            if(i!=2)
                board+="\n-----------\n";

        }
        printStream.println(board);
        return previousBoard;
    }
}
