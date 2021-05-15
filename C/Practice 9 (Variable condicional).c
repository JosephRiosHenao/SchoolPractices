#include <stdio.h>

int main()
{
    int Numero;
    scanf("%d",&Numero);
    int Condicional = Numero > 10 ? 100 : 0;
    printf("El valor es: %d\n", Condicional);
    return 0;
}