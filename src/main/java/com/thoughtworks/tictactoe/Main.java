package com.thoughtworks.tictactoe;

public class Main {
    public static void main(String[] args) {

        GameApplication game = new GameApplication(System.out, reader);
        game.start();

    }
}
