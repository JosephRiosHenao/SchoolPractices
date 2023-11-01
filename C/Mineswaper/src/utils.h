#ifndef UTILS_H
#define UTILS_H

int setCustomData(char *info, int min, int max);
int randomNumber(int min, int max);
int getPX(int cols);
int getPY(int rows);
int comprobate(int px, int py, int **gameTable, int **mineTable);
void warning();

#endif
