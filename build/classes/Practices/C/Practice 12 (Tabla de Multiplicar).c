#include <stdio.h>

int main()
{
    int Multiplo;
    int Alcance;
    printf("Digite el multiplo de tu tabla\n");
    scanf("%d",&Multiplo);
    printf("Digite el alcance de la tabla\n");
    scanf("%d",&Alcance);
    for (int i = 1; i <= Alcance; i++) printf("%d x %d = %d\n",Multiplo,i,(Multiplo*i));
    return 0;
}