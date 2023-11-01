#include "Utilities.h"
#include "Menu.h"
#include "src/ClassActivities.h"

#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

void subMenuActivities();
void subMenuClassActivities();
void principalMenu();

void principalMenu(){
    int menu;
    while (true){
        printf("\n\nMENU\n\n1. Class Activities\n\n2. Activities\n\n0.Exit\n\n");
        printf("Input option number: ");
        scanf("%d", &menu);
        switch (menu)
        {
        case 0:
            exit(1);
            break;
        case 1:
            subMenuClassActivities();
            break;
        case 2:
            subMenuActivities();
            break;
        default:
            printf("\n\nDigite una opcion valida\n\n");
            break;
        }
    }
}

void subMenuActivities(){
    int menu;
    bool exit_menu = false;
    while (!exit_menu)
    {
        
        printf("\n\nMENU\n\n1. Algorith 1 (2nd ActClass) Operations\n\n2. Algorith 2 (3nd ActClass) Secuence numbers\n\n0.Exit\n\n");
        printf("Input option number: ");
        scanf("%d", &menu);
        switch (menu)
        {
        case 0:
            exit_menu = true;
            break;
        case 1: break;
        default:
            printf("\n\nDigite una opcion valida\n\n");
            break;
        }
    }
}

void subMenuClassActivities(){
    int menu;
    bool exit_menu = false;
    while (!exit_menu){
        printf("\n\nMENU\n\n1. Algorith 1 (2nd ActClass) Operations\n\n2. Algorith 2 (3nd ActClass) Secuence numbers\n\n0.Exit\n\n");
        printf("Input option number: ");
        scanf("%d", &menu);
        switch (menu)
        {
        case 0: 
            exit_menu = true; 
            break;
        case 1: FirstActClass(); break;
        case 2: SecondActClass(10); break;
        default:
            printf("\n\nDigite una opcion valida\n\n");
            break;
        }
    }
}
