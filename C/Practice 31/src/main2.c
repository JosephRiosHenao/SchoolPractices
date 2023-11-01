//#include "Utilities.h"
//#include "Menu.h"
//#include "ClassActivities.h"
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <stdbool.h>

//
//int main(){
//    principalMenu();
//    return 0;
//}

int a = 0;

void act(){
    int i = 0,d;
    scanf("%d",&d); // 18 dia de nacimiento + 12 = 30
    do{
        i+=d;
    }while(i<100);
    printf("%d",i); //120
}



int random_number() {
    // Configura la semilla del generador de números aleatorios
    srand(time(NULL));

    // Genera un número aleatorio entre 1 y 100
    int numeroAleatorio = rand() % 100 + 1;

    // Imprime el número aleatorio
    printf("Número aleatorio entre 1 y 100: %d\n", numeroAleatorio);

    return numeroAleatorio;
}


void game(){
    int secret, try, answer;
    bool assert;
    char respuesta;

    while(true){
        assert = false;
        try = 1;
        secret = random_number();
        printf("Trate de adivinar el numero secreto!\n");
        while(!assert){
            printf("Digita un numero: ");
            scanf("%d", &answer);
            if (answer == secret){
                assert = true;
            }else if(answer > secret){
                printf("El numero ingresado es mayor\n");
            }else{
                printf("El numero ingresado es menor\n");
            }
            try++;
        }

        if(100-try>50){
            printf("Aprobo\n");
        }else{
            printf("Reprobo\n");
        }

        do {
            printf("Desea jugar de nuevo? (s/n): ");
            scanf(" %c", &respuesta);

            if (respuesta == 'n' || respuesta == 'N') {
                printf("Hasta luego.\n");
                return;
            } else if (respuesta != 's' && respuesta != 'S') {
                printf("Respuesta no válida. Por favor, ingresa 's' o 'n'.\n");
            }
        } while (respuesta != 's' && respuesta != 'S');

    }


}

void act2(){
    for(int i=0;i<10;i++){
        printf("%d", (i+1)*2);
    }
}

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
//    act();
//    game();
//    act2();
    actfinal();
    return 0;
}

