#include <stdbool.h>
#include <stdio.h>

#include "utils.h"
#include "table.h"
#include "mines.h"

// Game logic in turns
int runGame(int **gameTable, int **minesTable, int rows, int cols){
    // Declarate position vars
    int px, py, turn = 0;
    // Cycle for state in game
    while (true){
        turn++;
        // Draw table with 2 tables for mask reveal cells
        detectCapture(gameTable, minesTable, rows, cols, -1, -1);
        showStats(turn, gameTable, minesTable, rows, cols); 
        if (captureConditional(minesTable, rows, cols, -1) == 0){
            status("You Win!");
            return turn*captureConditional(minesTable, rows, cols, -2);
        } 
        getTable(gameTable,rows,cols);
        getTable(minesTable,rows,cols);
        getMaskTable(gameTable, minesTable, rows, cols);
        // Question position cell
        px = getPX(cols);
        py = getPY(rows);

        // Comprobate is playing cell or report to user
        switch (comprobate(px, py, gameTable, minesTable)){
            case 1: // Explode
                status("You Lose!");
                return turn;
            case 4: // Capture Cell
                status("This cell is capture!");
            case 2: // Show cell
                showCells(gameTable, minesTable, rows, cols, px, py);
                break;
            default: // Repeat cell
                warning();
                break;
        }

    }
}

// init game function
int startGame(int rows, int cols, int mines){    
    // Set custom table if necessary
    if (mines==0){
        rows = setCustomData("Input table rows: ", 8, 50);
        cols = setCustomData("Input table cols: ", 8, 25);
        mines = setCustomData("Input table mines: ", 1, 68);
    }
    // Declare vector of mines and play cells
    int **gameTable = setTable(rows, cols);
    int **minesTable = setMines(rows, cols, mines);
    // Run game
    int score = runGame(gameTable,minesTable,rows,cols);
    // Delete space in memory for tables
    freeTable(gameTable, rows);
    freeTable(minesTable, rows);
    return score;
}


