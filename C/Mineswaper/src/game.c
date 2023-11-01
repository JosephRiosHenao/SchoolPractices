#include <stdbool.h>

#include "utils.h"
#include "table.h"
#include "mines.h"

// Game logic in turns
void runGame(int **gameTable, int **minesTable, int rows, int cols){
    // Declarate position vars
    int px, py, turn;
    // Cycle for state in game
    while (true){
        turn++;
        getScore(turn, minesTable, rows, cols);
        // Draw table with 2 tables for mask reveal cells
        getMaskTable(gameTable, minesTable, rows, cols);
        // Question position cell
        px = getPX(cols);
        py = getPY(rows);
        // Comprobate position played
        switch (comprobate(px, py, gameTable, minesTable)){
        // Lose
        case 1:
            break;
        // Win
        case 2:
            break;
        // Reveal cell
        case 3:
            showCells(gameTable, minesTable, rows, cols, px, py);
            break;
        // Repeat cell
        case 4:
            warning();
            break;
        }
    }
}

// init game function
void startGame(int rows, int cols, int mines){    
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
    runGame(gameTable,minesTable,rows,cols);
    // Delete space in memory for tables
    freeTable(gameTable, rows);
    freeTable(minesTable, rows);
}


