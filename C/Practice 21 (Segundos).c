#include <stdio.h>

int main()
{
    int segundos;
    system("clear");
    printf("Digite la cantidad de segundos:\n");
    scanf("%d",&segundos);
    printf("Segundos: %d\nMinutos: %d\nHoras: %d\n",segundos,(segundos/60),(segundos/60/60));
    return 0;
}