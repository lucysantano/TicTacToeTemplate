package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by lsantano on 9/24/15.
 */
public class GameApplicationTest {

    private PrintStream printStream;
    private GameApplication game;
    private BufferedReader reader;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        game = new GameApplication(printStream,reader);

    }

    @Test
    public void shouldDisplayBoardCorrectlyWhenGameStarts(){
        game.start();
        verify(printStream).println("   |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   ");
    }

    @Test
    public void shouldPromptUserToEnterNumberWhenFirstPlayerHasTurn(){
        game.playerTurn();
        verify(printStream).println("Please enter a position number between 1 and 9:");
    }

    public void shouldPlaceAnXInFirstPositionWhenUserInputIsOne() throws IOException {
        when(reader.readLine()).thenReturn("1");


    }

}