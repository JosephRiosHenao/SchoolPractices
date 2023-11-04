#include <stdio.h>
#include <stdbool.h>

#include "utils.h"
#include "table.h"

// Set values for cells if around mines
void setCellsValues(int **table, int rows, int cols){
    // Declare mines detects for a cell
    int mineDetects;
    // Iterator in all table positions
    for (int i = 0; i < rows; i++){
        for (int j = 0; j < cols; j++){
            // Define mines a cell to 0
            mineDetects = 0;
            // Iterator for around cells
            for (int x = -1; x <= 1; x++){
                for (int y = -1; y <= 1; y++){
                    int ni = i + y;
                    int nj = j + x;
                    // Comprobate mines, and limits to table
                    if (ni >= 0 && ni < rows && nj >= 0 && nj < cols && table[ni][nj] == -1) mineDetects++;
                }
            }
            // If haven't mine when set value
            if (table[i][j] != -1) table[i][j] = mineDetects;
        }
    }
}

void detectCapture(int **gameTable, int **minesTable, int rows, int cols, int px, int py){
    if (px== -1 || py == -1){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (minesTable[i][j] == -1) detectCapture(gameTable, minesTable, rows, cols, i, j);
            }
        }
    }else{
        int aroundCells = 0;
        int aroundPlay = 0;
        for (int x = -1; x <= 1; x++){
            for (int y = -1; y <= 1; y++){
                int ni = py + y;
                int nj = px + x;
                if (ni >= 0 && ni < rows && nj >= 0 && nj < cols){
                    aroundCells += 1;
                    if (minesTable[ni][nj] < 1 || gameTable[ni][nj] == 1){
                        aroundPlay += 1;
                    }
                }
            }
        }
        printf("\nArround cells %d arround play %d", aroundCells, aroundPlay);
        if (((aroundPlay-1) == aroundCells) && minesTable[py][px] == -1){
            minesTable[py][px] = -2;
        } 
            
    }
}


// Set values for cells if around mines
void showCells(int **gameTable, int **minesTable, int rows, int cols, int px, int py){
    gameTable[py][px] = 1;
    for (int x = -1; x <= 1; x++){
        for (int y = -1; y <= 1; y++){
            int ni = py + y;
            int nj = px + x;
            if (ni >= 0 && ni < rows && nj >= 0 && nj < cols){
                if (gameTable[ni][nj] == 0){
                    if (minesTable[ni][nj] > 0) gameTable[ni][nj] = 1;  
                    if (minesTable[ni][nj] == 0) {
                        showCells(gameTable, minesTable, rows, cols, nj, ni);
                    }
                } 
            }
        }
    }
}

int captureConditional(int **table, int rows, int cols, int conditional){
    int capture = 0;
    for (int i = 0; i < rows; i++){
        for (int j = 0; j < cols; j++){
            if (table[i][j] == conditional) capture++;
        }
    }
    return capture;
}

// Set and return vector of mines in randoms positions
int **setMines(int rows, int cols, int mines){
    // Set table memory
    int **table = setTable(rows, cols);
    // px, py random position for mines and
    // remainingMine is random bombs lefts to colocate in table
    int px, py, remainingMines = mines;
    // Set mines in random location
    while (remainingMines>0){
        // Get numbers
        py = randomNumber(0,rows-1);
        px = randomNumber(0,cols-1);
        // When has no have mine because set a mine
        if (table[py][px] == 0){
            table[py][px] = -1;
            remainingMines--;
        }
    }
    // Set cells around in mines
    setCellsValues(table,rows,cols);
    return table;
}