package mow;

import java.util.Random;

public class Mower {
    private int row;
    private int col;
    private int direction; // 0=up, 1=right, 2=down, 3=left

    public int getRow() { return row; }
    public void setRow(int row) { this.row = row; }

    public int getCol() { return col; }
    public void setCol(int col) { this.col = col; }

    public int getDirection() { return direction; }
    public void setDirection(int direction) { this.direction = direction; }

    public void moveForward() {
        if (direction == 0) row--;
        else if (direction == 1) col++;
        else if (direction == 2) row++;
        else if (direction == 3) col--;
    }

    public void turnLeft() {
        direction = (direction + 3) % 4;
    }

    public void turnRight() {
        direction = (direction + 1) % 4;
    }

    // Check what is directly ahead
    public char peekAhead(Yard yard) {
        int nextRow = row;
        int nextCol = col;
        if (direction == 0) nextRow--;
        else if (direction == 1) nextCol++;
        else if (direction == 2) nextRow++;
        else if (direction == 3) nextCol--;
        return yard.getCell(nextRow, nextCol);
    }

    public boolean isGrassAhead(Yard yard) {
        return peekAhead(yard) == '+';
    }

    // Check what is to the right
    public char peekRight(Yard yard) {
        int rightDir = (direction + 1) % 4;
        int nextRow = row;
        int nextCol = col;
        if (rightDir == 0) nextRow--;
        else if (rightDir == 1) nextCol++;
        else if (rightDir == 2) nextRow++;
        else if (rightDir == 3) nextCol--;
        return yard.getCell(nextRow, nextCol);
    }

    // Check what is to the left
    public char peekLeft(Yard yard) {
        int leftDir = (direction + 3) % 4;
        int nextRow = row;
        int nextCol = col;
        if (leftDir == 0) nextRow--;
        else if (leftDir == 1) nextCol++;
        else if (leftDir == 2) nextRow++;
        else if (leftDir == 3) nextCol--;
        return yard.getCell(nextRow, nextCol);
    }

    public void cut(Yard yard) {
        yard.setCell(row, col, ' ');
    }

    public char getSymbol() {
        if (direction == 0) return '^';
        else if (direction == 1) return '>';
        else if (direction == 2) return 'v';
        else return '<';
    }

    // Place mower in a random corner, random direction
    public void randomize(Yard yard) {
        Random rand = new Random();
        int h = yard.getHeight();
        int w = yard.getWidth();

        // Pick one of 4 corners (row/col are inside the brick border, so start at 1)
        int corner = rand.nextInt(4);
        if (corner == 0) { row = 1;     col = 1; }         // top-left
        else if (corner == 1) { row = 1;     col = w; }    // top-right
        else if (corner == 2) { row = h;     col = 1; }    // bottom-left
        else                  { row = h;     col = w; }    // bottom-right

        direction = rand.nextInt(4);
    }

    // Move one step using spiral logic. Returns true if mowed, false if done.
    public boolean updateMower(Yard yard) {
        // Cut current spot
        cut(yard);

        // If grass is ahead, move forward
        if (isGrassAhead(yard)) {
            moveForward();
            return true;
        }

        // If grass is to the right, turn right and move
        if (peekRight(yard) == '+') {
            turnRight();
            moveForward();
            return true;
        }

        // If grass is to the left, turn left and move
        if (peekLeft(yard) == '+') {
            turnLeft();
            moveForward();
            return true;
        }

        // No grass ahead, right, or left — check if any grass remains anywhere
        for (int i = 0; i < yard.yard.length; i++) {
            for (int j = 0; j < yard.yard[0].length; j++) {
                if (yard.yard[i][j] == '+') {
                    return true; // grass remains but mower is stuck (shouldn't happen in spiral)
                }
            }
        }

        // No grass left anywhere — done
        return false;
    }
}