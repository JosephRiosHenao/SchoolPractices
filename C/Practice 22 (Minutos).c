#include <stdio.h>

int main()
{
    int minutos;
    system("clear");
    printf("Digite la cantidad de minutos:\n");
    scanf("%d",&minutos);
    printf("Segundos: %d\nMinutos: %d\nHoras: %d\n",(minutos*60),minutos,(minutos/60));
    return 0;
}