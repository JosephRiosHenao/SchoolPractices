#include <stdio.h>


int main()
{
    system("clear");
    int base,altura;
    printf("Digite la base del triangulo en cm\n");
    scanf("%d",&base);
    printf("Digite la altura del triangulo en cm\n");
    scanf("%d",&altura);
    printf("Base: %dcm\nAltura: %dcm\nArea: %dcm\nPerimetro: %dcm\n"
            ,base,altura,(base*altura)/2,(base+altura+altura));
    return 0;
}