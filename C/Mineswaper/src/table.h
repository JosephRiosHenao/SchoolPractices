#ifndef TABLE_H
#define TABLE_H

int** setTable(int rows, int cols);
void freeTable(int **table, int rows);
void getTable(int **table, int rows, int cols);
void getMaskTable(int **gameTable, int **mineTable, int rows, int cols);
void printCells(int cell);
void printHeaders(int cols);
void printArrows(int cols);
void firstRowDecorator(int cols); 
void firstColDecorator(int row);
void showStats(int turn, int **gameTable, int **mineTable, int rows, int cols);


#endif