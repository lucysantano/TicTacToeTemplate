package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by lsantano on 9/24/15.
 */
public class TicTacToeBoardTest {

    private PrintStream printStream;
    private TicTacToeBoard ticTacToeBoard;
    private int[] previousBoard = {0,0,0,0,0,0,0,0,0};

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        ticTacToeBoard = new TicTacToeBoard(printStream);
    }



    @Test
    public void shouldPlaceXInPositionOneWhenInputIsOne(){

        ticTacToeBoard.updateBoard("1","X", previousBoard);
        verify(printStream).println(" X |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   ");

    }

    @Test
    public void shouldPlaceXInPositionNineWhenInputIsNine(){

        ticTacToeBoard.updateBoard("9","X", previousBoard);
        verify(printStream).println("   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   | X ");

    }

    @Test
     public void shouldPlaceOInPositionOneWhenInputIsOne(){

        ticTacToeBoard.updateBoard("1","O", previousBoard);
        verify(printStream).println(" O |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   ");

    }

    @Test
    public void shouldAddPositionSymbolWhenAnotherSymbolIsAlreadyOnBoard(){

        int[] newBoard = ticTacToeBoard.updateBoard("1","X",previousBoard);
        ticTacToeBoard.updateBoard("2","O",newBoard);
        verify(printStream).println(" X | O |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   ");

    }
}
