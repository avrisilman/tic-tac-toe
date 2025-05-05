package com.tictactoe.app.model;

public class GameBoard {
    private final String[][] cells;
    private final int size;

    public GameBoard(int size) {
        this.size = size;
        this.cells = new String[size][size];
        clearBoard();
    }

    private void clearBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = "";
            }
        }
    }

    public int getSize() {
        return size;
    }

    public String[][] getCells() {
        return cells;
    }

    public String getCell(int row, int col) {
        return cells[row][col];
    }

    public boolean setCell(int row, int col, String symbol) {
        if (cells[row][col].isEmpty()) {
            cells[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (cells[i][j].isEmpty()) return false;
            }
        }
        return true;
    }
}