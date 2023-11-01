#include <time.h>
#include <stdlib.h>

#include "menu.h"

// Main function
int main(){
    // Set seed for random number
    srand(time(NULL));
    // Execute menu
    menu();
    return 0;
}