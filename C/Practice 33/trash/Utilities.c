#include "Utilities.h"
#include "Menu.h"
#include "src/ClassActivities.h"

#include <stdio.h>

int max(int a, int b){
    // Get maxinum number two values int
    if (a > b)
        return a;
    else
        return b;
}
int min(int a, int b){
    // Get minium number comparative
    if (a < b)
        return a;
    else
        return b;
}

void printNumberString(int num, int max){
    // Print number with ; if end the line ACT class Utilities
    if (max == num)
        printf("%d;\n", num);
    else
        printf("%d, ", num);
}
