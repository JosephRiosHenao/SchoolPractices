#include <stdio.h>

int main()
{
    int Enteros = 1234;
    float Flotantes = 10.56f;
    double DobleFlotantes = 28.523f;
    char Caracteres[5] = "Cinco";
    printf("Longitud de Flotantes: %f\n",sizeof(Flotantes));
    printf("Longitud de Doubles: %f\n",sizeof(DobleFlotantes));
    printf("Longitud de Enteros: %d\n",sizeof(Enteros));
    printf("Longitud de Caracteres: %d\n",sizeof(Caracteres));
    return 0;
}