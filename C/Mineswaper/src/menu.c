#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

#include "game.h"
#include "leadboard.h"
#include "utils.h"

// Print menu and question option to user
int getMenu(){
    int option;

    // infinite cycle for input valid option
    while (true){

        // Print memu
        printf("\n\n------- mineswaper -------\n");
        printf("level easy              .1\n");
        printf("level medium            .2\n");
        printf("level hard              .3\n");
        printf("custom                  .4\n");
        printf("leadboard               .5\n");
        printf("exit                    .6\n");
        printf("--------------------------\n\n");

        // Read option
        return setCustomData("- Input the option: ",1,6);
    }
}

// Logic menu and redirect to option
void menu(){
    while (true){
        switch (getMenu()){
            // Level Easy
            case 1:
                startGame(8,8,10);
            break;
            // Level Medium
            case 2:
                startGame(16,16,40);
            break;
            // Level Hard
            case 3:
                startGame(16,30,99);
            break;
            // Custom
            case 4:
                startGame(0,0,0);
            break;
            // Print leadboard
            case 5:
                getLeadboard();
            break;
            // Exit
            default: 
                exit(0);
        }
    }
}
