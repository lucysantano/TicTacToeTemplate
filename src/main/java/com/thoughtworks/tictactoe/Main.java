package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard(System.out);
        PlayerTurn playerTurn = new PlayerTurn(System.out, new BufferedReader(new InputStreamReader(System.in)));
        Player playerOne = new Player(playerTurn, ticTacToeBoard);
        Player playerTwo = new Player(playerTurn, ticTacToeBoard);
        GameApplication game = new GameApplication(System.out, playerOne, playerTwo);
        game.start();

    }
}
