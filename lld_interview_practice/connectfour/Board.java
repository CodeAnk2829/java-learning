package connectfour;

import connectfour.utils.*;

public class Board {
    private int rows;
    private int cols;
    private DiscColor[][] grid;

    Board() {
        this.rows = 7;
        this.cols = 6;
        grid = new DiscColor[rows][cols];
    }

    boolean canPlace(int col) {
        if(col < 0 && col >= cols) 
            return false;
        return grid[0][col] == null;
    }

    boolean isBoardFull() {
        for(int i = 0; i < this.cols; i++) {
            if(grid[0][i] == null) 
                return false;
        }
        return true;
    }

    int placeDisc(int col, DiscColor color) {
        if(isBoardFull()) 
            return -1;

        if(!canPlace(col))
            return -1;

        // find the lowest possible available row in that column
        for(int i = 6; i >= 0; i--) 
            if(grid[i][col] == null) 
                return i;

        return -1;
    }

    boolean checkWin(int row, int col, DiscColor color) {
        // invalid row and col
        if((row < 0 && row >= 7) || 
            (col < 0 && col >= 6))
            return false;

        // check rows
        return false;
    }
}
