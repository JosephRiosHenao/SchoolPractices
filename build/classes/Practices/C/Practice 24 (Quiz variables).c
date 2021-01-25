#include <stdio.h>

int main()
{
    int x=7,y;
    y = -2 + --x; //4
    printf("1) %d\n",y);
    y += 2; //6
    printf("2) %d\n",y);
    y = (y == x); //1 o 6
    printf("3) %d\n",y);
    y = y++ - x; //0 o -5
    printf("4) %d\n",y);
    return 0;
    //Quiz completado puntuacion 10/10 dudando en 2
}