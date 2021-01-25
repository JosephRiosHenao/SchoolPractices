#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
    bool Confirmacion = true;
    int Filas,Columnas,Eleccion,NumeroAEncontrar;
    printf("Digite la cantidad de columnas\n");
    scanf("%d",&Columnas);
    system("clear");
    printf("Digite la cantidad de filas\n");
    scanf("%d",&Filas);
    system("clear");
    Columnas++;
    Filas++;
    while (Confirmacion)
    {
        for (int i = 0; i < Filas - 1; i++)
        {
            for (int j = 0; j < Columnas - 1; j++)
            {
                printf(" [%d]",j);
            }
            printf("\n");
        }
        printf("-Menu-\n1.Confirmar\n2.Cambiar tamaño\n3.Salir\n");
        scanf("%d",&Eleccion);
        system("clear");
        switch (Eleccion)
        {
            case 1:
                Confirmacion = false;
            break;
            case 2:
                printf("Digite la cantidad de columnas\n");
                scanf("%d",&Columnas);
                system("clear");
                printf("Digite la cantidad de filas\n");
                scanf("%d",&Filas);
                system("clear");    
                Columnas++;
                Filas++;
            break;
            case 3:
                exit(1);
            break;
            default:
                printf("Digite una opcion valida\n");
        }
    }
    int Matriz[Filas][Columnas];
    for (int i = 0; i < Filas - 1; i++)
    {
        for (int j = 0; j < Columnas - 1; j++)
        {
            Matriz[i][j] = 0;
        }
    }
    while (true)
    {
        system("clear");
        for (int i = 0; i < Filas - 1; i++)
        {
            for (int j = 0; j < Columnas - 1; j++)
            {
                printf(" [%d]",Matriz[i][j]);
            }
            printf("\n");
        }
        printf("-Menu-\n1.Asignar valores\n2.Buscar pocision\n3.Salir\n");
        scanf("%d",&Eleccion);
        system("clear");
        switch (Eleccion)
        {
            case 1:
                printf("Introduzca los valores para la matriz\n");
                for (int i = 0; i < Columnas - 1; ++i)
                {
                    for (int j = 0; j < Filas - 1; ++j)
                    {
                        printf("Valor para el elemento [%d][%d]: \n", i, j);
                        scanf("%d",&Matriz[i][j]);
                    }
                    printf("\n");
                }
            break;
            case 2:
                printf("Digite el numero que desee encontrar\n");
                scanf("%d",&NumeroAEncontrar);
                for (int i = 0; i < Columnas - 1; ++i)
                {
                    for (int j = 0; j < Filas - 1; ++j)
                    {
                        if (Matriz[i][j] == NumeroAEncontrar) printf("El numero %d se encuentra en la pocision: [%d][%d] \n",NumeroAEncontrar,i, j);
                    }
                }
                system("pause");
            break;
            case 3:
                exit(1);
            break;
        }
    }
    return 0;
}