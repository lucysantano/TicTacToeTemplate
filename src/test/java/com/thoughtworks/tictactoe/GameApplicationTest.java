package com.thoughtworks.tictactoe;

import org.junit.Test;

import java.awt.image.PixelInterleavedSampleModel;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by lsantano on 9/24/15.
 */
public class GameApplicationTest {

    private PrintStream printStream;
    private GameApplication game;

    @Test
    public void shouldDisplayFirstLineOfBoardCorrectlyWhenBoardViewBegins(){

        printStream = mock(PrintStream.class);
        game = new GameApplication(printStream);

        game.viewBoard();

        verify(printStream).println("   |   |   ");

    }

}