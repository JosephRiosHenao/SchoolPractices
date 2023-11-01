#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int lenght = 0;
int vector[6];
int vectorSum[6];
int vectorCut[6];
int vectorRest[6];
int lenghtRestCut[2] = {0,0};

void upVolumen(int multiply){
    for (int i = 0; i < lenght; i++){
        vector[i] *= multiply;
    }
}
void downVolumen(int division){
    for (int i = 0; i < lenght; i++){
        if (vector[i]%division==0){
            vector[i] /= division;
        }
    }
}

void printVector(int tamano, int vectorPrint[]){
    printf("\n");
    for (int i = 0; i < tamano; i++){
        printf("[ %d ] ", vectorPrint[i]);
    }
    printf("\n");
}


void sumVolumen(int init, int final){
    for (int i = 0; i < lenght; i++){
        if(i >= init && i <= final){
            vector[i]+=vectorSum[i];
        }else{
            vector[i] -= vector[i];
        }
    }
}


void cutVolumen(int init, int final){
    int indexCut = 0;
    int indexRes = 0;
    lenghtRestCut[0] = 0;
    lenghtRestCut[1] = 0;
    for (int i = 0; i < lenght; i++){
        if (i >= init && i <= final){
            vectorCut[indexCut] = vector[i];
            lenghtRestCut[0]++;
            indexCut++;
        }else{
            vectorRest[indexRes] = vector[i];
            lenghtRestCut[1]++;
            indexRes++;
        }
    }
}

void pasteVolumen(int index){
    for (int i = 0; i < lenght; i++){
        if (i==index){
            for (int j = 0; j < lenghtRestCut[1]; j++){
                vector[i+j] = vectorCut[j];
            }
        }
        if (i>index){
            vector[i+lenghtRestCut[1]] = vector[i] ;
        }
    }
}

void createSound(){
    for (int i = 0; i < lenght; i++){
        vector[i] =(rand() % 100) + 1;
    }
    
}

void createSoundRemix(){
    for (int i = 0; i < lenght; i++){
        vectorSum[i] =(rand() % 100) + 1;
    }
    
}

int main()
{
    srand(time(NULL));
    int opcion, inputUser = 0, inputUser2 = 0, salir = 0;
    while (salir==0){
        printf("Programa para manipulacion de sonidos.\n");
        printf("1- Tamanio del sonido(max 100)\n");
        printf("2- Crear sonidos\n");
        printf("3- Visualizar sonidos\n");
        printf("4- Mezclar sonidos\n");
        printf("5- Cortar sonido\n");
        printf("6- Pegar sonido\n");
        printf("7- Disminuir sonido\n");
        printf("8- Aumentar sonido\n");
        printf("9- Salir\n");
        printf("Digite una opcion\n");
        scanf("%d", &opcion);
        switch (opcion){
        case 1:
            printf("Digite el nuevo tamaño: ");
            scanf("%d", &lenght);
            break;
        case 2:
            createSound();
            break;
        case 3:
            printf("Vector de volumen: ");
            printVector(lenght, vector);
            printf("Vector de suma: ");
            printVector(lenght, vectorSum);
            printf("Vector de corte: ");
            printVector(lenghtRestCut[0], vectorCut);
            printf("Vector de residuo: ");
            printVector(lenghtRestCut[1], vectorRest);
            break;
        case 4:
            printf("Digite el indice inicial de corte: ");
            scanf("%d", &inputUser);
            printf("Digite el indice final de corte: ");
            scanf("%d", &inputUser2);
            printf("Vector de la suma: \n");
            printVector(lenght, vector);
            createSoundRemix();
            printVector(lenght, vectorSum);
            sumVolumen(inputUser, inputUser2);
            printVector(lenght, vector);
            break;
        case 5:
            printVector(lenght, vector);
            printf("Digite el indice inicial de corte: ");
            scanf("%d", &inputUser);
            printf("Digite el indice final de corte: ");
            scanf("%d", &inputUser2);
            cutVolumen(inputUser, inputUser2);
            printVector(lenghtRestCut[0], vectorCut);
            printVector(lenghtRestCut[1], vectorRest);
            printVector(lenght, vector);
            break;
        case 6:
            printVector(lenght, vector);
            printf("Indice en el que se pega el vector cortado: ");
            scanf("%d", &inputUser);
            pasteVolumen(inputUser);
            printVector(lenght, vector);
            break;
        case 7:
            printVector(lenght, vector);
            printf("Digite la constante de division: ");
            scanf("%d", &inputUser);
            downVolumen(inputUser);
            printVector(lenght, vector);
            break;
        case 8:
            printVector(lenght, vector);
            printf("Digite la constante de multiplicacion: ");
            scanf("%d", &inputUser);
            upVolumen(inputUser);
            printVector(lenght, vector);
            break;
        case 9:
            salir=1;
            printf("Byee!");
            break;
        }
    }
}
