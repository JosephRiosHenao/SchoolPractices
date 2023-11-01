#include <stdio.h>
#include <stdbool.h>

void actfinal(){
    int respuesta, multiplo;
    while(true){
        printf("1. Ver tabla \n2. Salir\n Digita el indice de la opcion: ");
        scanf(" %d", &respuesta);
        switch (respuesta) {
            case 1:
                printf("Digita el multiplo de la tabla: ");
                scanf(" %d", &multiplo);
                for (int i = 1; i < 11; ++i) {
                    printf("%d x %d = %d\n", multiplo, i, multiplo*i);
                }
                break;

            case 2:
                return;
            default:
                printf("Escribe una opcion valida \n");
                break;
        }
    }
}

int main(){
    actfinal();
    return 0;
}

