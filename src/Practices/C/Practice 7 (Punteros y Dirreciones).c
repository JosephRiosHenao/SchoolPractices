#include <stdio.h>

int main()
{
    int a = 10;
    int *dir = &a;
    int b = *dir;
    printf("El valor de a es: %d\n",a);
    printf("La direccion de a es: %d\n",dir);
    printf("El valor de b es: %d\n",b);
    printf("La direccion de b es: %d\n",&b);
    return 0;
}