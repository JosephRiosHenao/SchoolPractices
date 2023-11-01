#include <stdio.h>
int vector[100];
void llenarVector(int tamano){
    int valor;
    for (int i = 0; i < tamano; i++){
        printf("Digita un valor: ");
        scanf("%d", &valor);
        vector[i] = valor;
    }
}
void imprimirVector(int tamano){
    printf("\n");
    for (int i = 0; i < tamano; i++){
        printf("[ %d ] ", vector[i]);
    }
    printf("\n");
}
void promedioVector(int tamano){
    int sumaTotal = 0;
    for (int i = 0; i < tamano; i++){
        sumaTotal += vector[i];
    }
    printf("Promedio %d\n", sumaTotal/tamano);
}
void maxVector(int tamano){
    int maximo = 0;
    for (int i = 0; i < tamano; i++){
        if (maximo<=vector[i]) maximo = vector[i];
    }
    printf("Maximo %d\n", maximo);
}
void minVector(int tamano){
    int minimo = 100;
    for (int i = 0; i < tamano; i++){
        if (minimo>=vector[i]) minimo = vector[i];
    }
    printf("Minimo %d\n", minimo);
}
int main(){
    int opcion, tamano = 0, salir=0;
    while (salir==0){
        printf("\n\nTamaño actual del vector: %d\n", tamano);
        printf("1- Leer tamaño 1-100\n");
        printf("2- Llenar vector\n");
        printf("3- Promedio\n");
        printf("4- Minimo\n");
        printf("5- Maximo\n");
        printf("6- Salir\n");
        printf("Digite una opcion\n");
        scanf("%d", &opcion);
        switch (opcion){
        case 1:
            printf("Digite el nuevo tamaño: ");
            scanf("%d", &tamano);
            break;
        case 2:
            llenarVector(tamano);
            break;
        case 3:
            promedioVector(tamano);
            break;
        case 4:
            minVector(tamano);
            break;
        case 5:
            maxVector(tamano);
            break;
        case 6:
            salir=1;
            printf("Byee!");
            break;
        }
    }
}

