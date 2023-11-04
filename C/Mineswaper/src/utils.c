#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

#include "utils.h"

// Question PX
int getPX(int cols){
    return setCustomData("PX", 0, cols-1);
}

// Question PY
int getPY(int rows){
    return setCustomData("PY", 0, rows-1);
}

// Question value in range return int
int setCustomData(char *info, int min, int max){
    int input;
    while (true){
        printf("\n%s - [%d - %d]: ", info, min, max);
        scanf("%d", &input);
        if (input>=min && input<=max){
            return input;
        }else{
            warning();
        }
    }
}

// Comprobate play cell in movement
int comprobate(int px, int py, int** gameTable, int** mineTable){
    if (mineTable[py][px] == -1) return 1; // Explode
    if (gameTable[py][px] == 0) return 2; // Show cell
    return 3; // Repeat cell
}

// Generate random number
int randomNumber(int min, int max) {return min + rand() % (max - min + 1);}

// Display Warning message
void warning(){
    printf("--------------------------\n");
    printf("WRN: Select a valid option\n");
    printf("--------------------------\n");
}

// Display status message
void status(char* message){
    printf("--------------------------\n");
    printf("STATE: %s\n", message);
    printf("--------------------------\n");
}