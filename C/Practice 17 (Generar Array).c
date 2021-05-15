#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int BuscarPocision(int Valores[], int Size, int NumeroAEncontrar)
{
    for (int i = 0; i < Size; i++)
    {
        if (Valores[i] == NumeroAEncontrar) return i; 
    }
}

void MostrarArray(int Valores[], int Size)
{
    system("clear");
    for (int i = 0; i < Size; i++)
    {
        printf(" [%d]",Valores[i]);
    }
    printf("\n");
}

int main()
{
    int Selection;
    int Size;
    int NumeroAEncontrar;
    printf("Digite el tamano del array unidimensional\n");
    scanf("%d",&Size);
    int Array[Size];
    for (int i = 0; i < Size; i++)
    {
        Array[i] = 0;
    }
    while (true)
    {
        MostrarArray(Array, Size);
        printf("-Menu-\n1.Asignar valores\n2.Buscar pocision\n3.Salir\n");
        scanf("%d",&Selection);
        switch (Selection)
        {
            case 1:
                for (int i = 0; i < Size; i++)
                {
                    system("clear");
                    printf("Digite el %drd valor\n",i+1);
                    scanf("%d",&Array[i]);
                }
            break;
            case 2:
                printf("Digite el numero que desea hallar\n");
                scanf("%d",&NumeroAEncontrar);
                printf("El numero %d se encuentra en la posición %d\n",NumeroAEncontrar,BuscarPocision(Array,Size,NumeroAEncontrar));
                system("pause"); 
            break;
            case 3:
                exit(1);
            break;
            default:
                printf("Digite una opcion valida\n");
        }
    }
    return 0;
}