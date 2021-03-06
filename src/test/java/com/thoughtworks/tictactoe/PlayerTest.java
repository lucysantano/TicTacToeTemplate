package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by lsantano on 9/24/15.
 */
public class PlayerTest {

    private Player player;
    private PlayerTurn playerTurn;
    private PrintStream printStream;
    private TicTacToeBoard ticTacToeBoard;
    private String playerSymbol;
    private int[] board;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        playerTurn = mock(PlayerTurn.class);
        ticTacToeBoard = mock(TicTacToeBoard.class);
        player = new Player(playerTurn, ticTacToeBoard, playerSymbol);
    }
    @Test
    public void shouldHavePlayerWithZeroPositionsWhenPlayerIsCreated(){
        player.createPlayer();
        assertThat(player.totalNumberOfPositions(), is(0));
    }

    @Test
    public void shouldPromptUserWhenPlayersTurnStarts(){
        player.startTurn(board);
        verify(playerTurn).promptSelection();
    }

    @Test
    public void shouldPlaceXInPositionOneWhenInputIsPositionOne(){
        when(playerTurn.promptSelection()).thenReturn("1");
        player.startTurn(board);
        verify(ticTacToeBoard).updateBoard("1", playerSymbol, board);
    }


}