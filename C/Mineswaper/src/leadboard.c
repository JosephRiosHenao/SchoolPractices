#include <stdbool.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>

#include "leadboard.h"

char scores[5][10][10] = {{"MARIO", "52"},  {"DIANA", "100"}};

// Print leadborad in screen
void getLeadboard(){
    printf("------- leadboard --------\n");
    for (int i = 0; i < 5; i++){
        printScore(scores[i], i+1);
    }
    printf("--------------------------\n\n");
}

void printScore(char score[10][10], int position){
    if (strlen(score[0]) > 1){
        printf("%d. %s ", position, score[0]);
        for (int i = 0; i < 16 - strlen(score[0]) - strlen(score[1]); i++){
            printf(".");
        }
        printf(" PTS. %s\n", score[1]);
    }
}