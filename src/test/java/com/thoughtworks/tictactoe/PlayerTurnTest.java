package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by lsantano on 9/24/15.
 */
public class PlayerTurnTest {

    private PrintStream printStream;
    private PlayerTurn playerTurn;
    private BufferedReader reader;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        playerTurn = new PlayerTurn(printStream, reader);
    }

    @Test
    public void shouldPromptUserToEnterNumberWhenFirstPlayerHasTurn() {
        playerTurn.promptSelection();
        verify(printStream).println("Please enter a position number between 1 and 9:");
    }

    @Test
     public void shouldReturnOneWhenUserInputsPositionOne() throws IOException {
        when(reader.readLine()).thenReturn("1");
        String position = playerTurn.promptSelection();
        assertEquals(position, "1");

    }
    @Test
    public void shouldReturnThreeWhenUserInputsPositionThree() throws IOException {
        when(reader.readLine()).thenReturn("3");
        String position = playerTurn.promptSelection();
        assertEquals(position, "3");

    }
}