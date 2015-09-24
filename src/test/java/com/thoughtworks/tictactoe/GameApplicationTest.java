package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by lsantano on 9/24/15.
 */
public class GameApplicationTest {

    private PrintStream printStream;
    private Player playerOne;
    private Player playerTwo;
    private GameApplication game;



    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        playerOne = mock(Player.class);
        playerTwo = mock(Player.class);
        game = new GameApplication(printStream, playerOne, playerTwo);

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
    public void shouldPlayerOneIsCreatedWhenGameStarts(){
        game.start();
        verify(playerOne).createPlayer();
    }

    @Test
    public void shouldPlayerTwoIsCreatedWhenGameStarts(){
        game.start();
        verify(playerTwo).createPlayer();
    }

    @Test
    public void shouldStartPlayerOnesTurnWhenGameStarts(){
        game.start();
        verify(playerOne).startTurn();
    }

    @Test
    public void shouldStartPlayerTwosTurnWhenGameStarts(){
        game.start();
        verify(playerTwo).startTurn();
    }
}

