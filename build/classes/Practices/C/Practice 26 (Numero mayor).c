#include <stdio.h>

int main()
{
    int a,b,mayor;
    system("clear");
    printf("Digite el primer numero:\n");
    scanf("%d",&a);
    printf("Digite el segundo numero:\n");
    scanf("%d",&b);
    if (a>b) mayor = a;
    else mayor = b;
    printf("El numero mayor es %d\n", mayor);
    return 0;
}