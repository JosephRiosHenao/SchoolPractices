#include <stdio.h>

int main()
{
    int Mayor  = 0, Menor = 0, Medio = 0, Numeros[3];
    for (int i = 0; i < 3; i++)
    {
        printf("Digite el %d° numero: ",(i+1));
        scanf("%d",&Numeros[i]);
        if (i == 0) Menor  = Numeros[i];
        if (Mayor<Numeros[i]) Mayor = Numeros[i];
        if (Menor>Numeros[i]) Menor = Numeros[i]; 
        if ((Numeros[0] == Menor || Numeros[0] == Mayor) && (Numeros[2] == Menor || Numeros[2] == Mayor)) Medio = Numeros[1];
        else if ((Numeros[0] == Menor || Numeros[0] == Mayor) && (Numeros[1] == Menor || Numeros[1] == Mayor)) Medio = Numeros[2];
        else Medio = Numeros[0];
    }
    system("clear");
    printf("Numero 1: %d\nNumero 2: %d\nNumero 3: %d\nMayor: %d\nMedio: %d\nMenor: %d\n", Numeros[0],Numeros[1],Numeros[2],Mayor,Medio,Menor);
    return 0;
}