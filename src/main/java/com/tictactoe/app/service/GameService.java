package com.tictactoe.app.service;

import com.tictactoe.app.model.GameBoard;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private GameBoard gameBoard;
    private String currentPlayer;
    private String winner;

    public void initGame(int size) {
        gameBoard = new GameBoard(size);
        currentPlayer = "X";
        winner = "";
    }

    public void makeMove(int row, int col) {
        if (!winner.isEmpty() || !gameBoard.setCell(row, col, currentPlayer)) return;

        if (checkWin(row, col)) {
            winner = currentPlayer;
        } else if (gameBoard.isFull()) {
            winner = "Draw";
        } else {
            switchPlayer();
        }
    }

    private boolean checkWin(int row, int col) {
        return checkRow(row) || checkColumn(col) || checkDiagonals();
    }

    private boolean checkRow(int row) {
        for (int col = 0; col < gameBoard.getSize(); col++) {
            if (!gameBoard.getCell(row, col).equals(currentPlayer)) return false;
        }
        return true;
    }

    private boolean checkColumn(int col) {
        for (int row = 0; row < gameBoard.getSize(); row++) {
            if (!gameBoard.getCell(row, col).equals(currentPlayer)) return false;
        }
        return true;
    }

    private boolean checkDiagonals() {
        boolean leftToRight = true, rightToLeft = true;
        int size = gameBoard.getSize();

        for (int i = 0; i < size; i++) {
            if (!gameBoard.getCell(i, i).equals(currentPlayer)) leftToRight = false;
            if (!gameBoard.getCell(i, size - i - 1).equals(currentPlayer)) rightToLeft = false;
        }

        return leftToRight || rightToLeft;
    }

    private void switchPlayer() {
        currentPlayer = currentPlayer.equals("X") ? "O" : "X";
    }

    public GameBoard getBoard() {
        return gameBoard;
    }

    public String getWinner() {
        return winner;
    }

}
