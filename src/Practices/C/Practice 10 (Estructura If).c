#include <stdio.h>

int main()
{
    int Edad;
    printf("Digite su edad\n");
    scanf("%d",&Edad);
    if (Edad < 18){
        printf("Usted es menor de edad");
    }
    else{
        printf("Usted es mayor de edad");
    }
    return 0;
}