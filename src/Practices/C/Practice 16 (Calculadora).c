#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int PedirNumeros(int NumeroAPedir,bool AceptarCeros)
{
    int Numero = 0;
    while (true)
    {
        printf("Digite el %d numero\n",NumeroAPedir);
        scanf("%d",&Numero);
        if (AceptarCeros == true && Numero == 0) continue;
        return Numero;
        break;
    }
}

int Suma(int Numero1, int Numero2) {return Numero1 + Numero2;}
int Resta(int Numero1, int Numero2) {return Numero1 - Numero2;}
int Multiplicacion(int Numero1, int Numero2) {return Numero1 * Numero2;}
int Division(int Numero1, int Numero2) {return Numero1 / Numero2;}

int main()
{
    int Eleccion, Numero1, Numero2;
    while (true)
    {
        printf("--Calculadora Basica--\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n5.Salir\n");
        scanf("%d",&Eleccion);
        switch (Eleccion)
        {
            case 1:
                Numero1 = PedirNumeros(1,true);
                Numero2 = PedirNumeros(2,true);
                printf(" %d + %d = %d\n",Numero1,Numero2,Suma(Numero1,Numero2));
            break;
            case 2:
                Numero1 = PedirNumeros(1,true);
                Numero2 = PedirNumeros(2,true);
                printf(" %d - %d = %d\n",Numero1,Numero2,Resta(Numero1,Numero2));
            break;
            case 3:
                Numero1 = PedirNumeros(1,false);
                Numero2 = PedirNumeros(2,false);
                printf(" %d * %d = %d\n",Numero1,Numero2,Multiplicacion(Numero1,Numero2));
            break;
            case 4:
                Numero1 = PedirNumeros(1,false);
                Numero2 = PedirNumeros(2,false);
                printf(" %d / %d = %d\n",Numero1,Numero2,Division(Numero1,Numero2));
            break;
            case 5:
                printf("Saliendo de la Calculadora...\n");
                exit(1);
            default:
                printf("Elija una opcion valida\n");
        }
    }
    return 0; 
}

