
#ifndef MINES_H
#define MINES_H

int **setMines(int rows, int cols, int mines);
void showCells(int **gameTable, int **minesTable, int rows, int cols, int px, int py);
void detectCapture(int **gameTable, int **minesTable, int rows, int cols, int px, int py);
int captureConditional(int **table, int rows, int cols, int conditional);

#endif