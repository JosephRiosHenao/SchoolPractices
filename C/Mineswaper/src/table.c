#include <stdio.h>
#include <stdlib.h>

#include "table.h"
#include "mines.h"

// Print table
void getTable(int **table, int rows, int cols){
    // Iterator all cells to table
    for (int i = 0; i < rows; i++){
        for (int j = 0; j < cols; j++){
            // Print cell
            printCells(table[i][j]);
        }
        printf("\n");
    }
    printf("\n");
}

// Show Stats
void showStats(int turn, int **gameTable, int **mineTable, int rows, int cols){
    printf("|- Turn %d -=- ", turn);
    printf("Remaining Mines %d -=- ", captureConditional(mineTable, rows, cols, -1));
    printf("Capture Mines %d -| \n", captureConditional(mineTable, rows, cols, -2));
}




// Print table but show cells reveals
void getMaskTable(int **gameTable, int **mineTable , int rows, int cols){
    printf("\n");
    // Iterator all cells to table
    for (int i = 0; i < rows; i++){
        // If is a first row print decorator info to first line
        if (i == 0) firstRowDecorator(cols);
        for (int j = 0; j < cols; j++){
            // If is a first col print decorator info to first column
            if (j == 0) firstColDecorator(i);
            // If is a reveal cell print value else print games cells
            if (gameTable[i][j] == 1 && mineTable[i][j] == 0) printCells(mineTable[i][j]);
            else if (gameTable[i][j] == 1) printCells(mineTable[i][j]);
            else if (gameTable[i][j] == 0 && mineTable[i][j] == -2) printCells(mineTable[i][j]);
            else printCells(gameTable[i][j]);
        }
        printf("\n");
    }
}

// Print column decorator
void firstColDecorator(int row){
    // if is has 2 intenegers number include space in arrow
    if (row/10>=1) printf("%d → ", row);
    else printf("%d  → ", row);
}

// Print row decorator
void firstRowDecorator(int cols){
    // Separator to column decorator
    printf("     ");
    // Print numbers positions
    printHeaders(cols);
    printf("\n");
    printf("     ");
    // Arrow to indicate colunn
    printArrows(cols);
    printf("\n");
}

// Print numbers position to columns
void printHeaders(int cols){
    // Iterator for columns
    for (int i = 0; i < cols; i++){
        // IF is has 2 integers number include space minus to visual beautiful
        if (i/10>=1) printf(" %d  ", i);
        else printf("  %d  ", i);
    }
}

// Print arrows to columns
void printArrows(int cols){
    // Iterator for number cols and print arrow
    for (int i = 0; i < cols; i++){
        printf("  ↓  ");
    }
}

// Print cells and values
void printCells(int cell){
    // Is a no reveal cell
    if (cell == 0) printf("[ ■ ]");
    // Is a blank cell
    else if (cell == -3) printf("[   ]");
    // Is a mine capture
    else if (cell == -2) printf("[ c ]");
    // Is a mine
    else if (cell == -1) printf("[ x ]");
    // Reveal number value for mines around
    else printf("[ %d ]", cell);
}

// Reserve space to table dinmaic set
int **setTable(int rows, int cols){
    // Allocate memory for rows
    int **table = (int **)malloc(rows * sizeof(int *)); 
    for (int i = 0; i < rows; i++){
        // Allocate memory for each row
        table[i] = (int *)malloc(cols * sizeof(int)); 
        for (int j = 0; j < cols; j++){
            table[i][j] = 0;
        }
    }
    return table;
}

// Delete space in memory to table
void freeTable(int **table, int rows){
    for (int i = 0; i < rows; i++){
        // Free memory for each row
        free(table[i]); 
    }
    // Free memory for the table itself
    free(table); 
}