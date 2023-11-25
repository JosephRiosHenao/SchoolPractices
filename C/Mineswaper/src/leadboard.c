#include <stdbool.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>


#include "leadboard.h"

char scores[5][10][10] = {{"","0"},  
                          {"","0"},
                          {"","0"},
                          {"","0"},
                          {"","0"}};

// Print leadborad in screen
void getLeadboard(){
    printf("\n\n------- leadboard --------\n");
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

void setScore(int score){
    // Find the position to insert the new score
    int insertPos = -1;
    for (int i = 0; i < 5; i++) {
        if (strlen(scores[i][0]) == 0 || score > atoi(scores[i][1])) {
            insertPos = i;
            break;
        }
    }


    if (insertPos != -1) {

       char name[10];
        // Prompt the user to enter their name for the new score
        printf("Enter your name for the new score: ");
        scanf("%9s", name);

        // Update the name and score in the leaderboard
        strcpy(scores[insertPos][0], name);
        char newScore[10];
        snprintf(newScore, sizeof(newScore), "%d", score);
        strcpy(scores[insertPos][1], newScore);

        // Print the updated leaderboard
        getLeadboard();
    } else {
        printf("Sorry, your score is not high enough to make it to the leaderboard.\n");
    }
}