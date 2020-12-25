#include <stdio.h>

int main()
{
    int horas;
    system("clear");
    printf("Digite la cantidad de horas:\n");
    scanf("%d",&horas);
    printf("Segundos: %d\nMinutos: %d\nHoras: %d\n",(horas*60*60),(horas*60),horas);
    return 0;
}