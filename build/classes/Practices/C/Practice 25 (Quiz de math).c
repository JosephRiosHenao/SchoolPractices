#include <stdio.h>

int main()
{
    printf("%d\n",(5 / 2 + 20 % 6)); //4
    printf("%d\n",(4 * 6 / 2 - 15 / 2)); //5
    printf("%d\n",(5 * 15 / 2 / (4 - 2))); //18
    printf("%d\n",(8 == 16 || 7 != 4 && 4 < 1)); //0
    printf("%d\n",((4 * 3 < 6 || 3 > 5 - 2) && 3 + 2 < 12)); //0
    //Todas completas 10/10 sin fallos
    return 0;
}