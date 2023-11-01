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
int setCustomData(char * info, int min, int max){
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

void getScore()

// Comprobate play cell in movement
int comprobate(int px, int py, int** gameTable, int** mineTable){
    if (gameTable[py][px] == 0){
        // New reveal
        return 3;
    }else{
        if (mineTable[py][px]==-1){
            // Explode mine
            return 1;
        }
    }
    // Repeat cell
    return 4;
}

// Generate random number
int randomNumber(int min, int max) {return min + rand() % (max - min + 1);}

// Display Warning message
void warning(){
    printf("--------------------------\n");
    printf("WRN: Select a valid option\n");
    printf("--------------------------\n");
}