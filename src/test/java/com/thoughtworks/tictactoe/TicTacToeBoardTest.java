package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by lsantano on 9/24/15.
 */
public class TicTacToeBoardTest {

    private PrintStream printStream;
    private TicTacToeBoard ticTacToeBoard;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        ticTacToeBoard = new TicTacToeBoard(printStream);
    }



    @Test
    public void shouldPlaceXInPositionOneWhenInputIsOne(){

        ticTacToeBoard.updateBoard("1");
        verify(printStream).println(" X |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   ");

    }

    @Test
    public void shouldPlaceXInPositionNineWhenInputIsNine(){

        ticTacToeBoard.updateBoard("9");
        verify(printStream).println("   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   | X ");

    }
}
