#include <stdio.h>

int main()
{
    int a = 10;
    int *dir = &a;
    int b = *dir;
    printf("El valor de b es: %d",b);
    return 0;
}