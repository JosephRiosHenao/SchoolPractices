
#ifndef MINES_H
#define MINES_H

int **setMines(int rows, int cols, int mines);
void showCells(int **gameTable, int **minesTable, int rows, int cols, int px, int py);
int comprobateMines(int **table, int rows, int cols);

#endif