#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int rango = 0;
int sonido[100];
int corteSonido[100];
int residuoSonido[100];
int rangoCorte = 0;
int rangoResiduo = 0;
void aumentarVolumen(){
    int aumento;
    printf("Aumentar volumen por: ");
    scanf("%d", &aumento);
    for (int i = 0; i < rango; i++) sonido[i] *= aumento;
}
void disminuirVolumen(){
    int disminuir;
    printf("Disminuir volumen por: ");
    scanf("%d", &disminuir);
    for (int i = 0; i < rango; i++) if (sonido[i] % disminuir == 0) sonido[i] /= disminuir;
}
void imprimirSonido(int tamano, int sonidoImprimir[]){
    for (int i = 0; i < tamano; i++) printf(" %d ", sonidoImprimir[i]);
    printf("\n");
}
void agregarVolumen(int inicio, int final){
    for (int i = 0; i < rango; i++){
        if (i >= inicio && i <= final) sonido[i] += (rand() % 100) + 1;
        else sonido[i] = 0;
    }
}
void cortarSonido(int inicio, int final){
    int nuevoIndiceCorte = 0;
    int nuevoIndiceResiduo = 0;
    rangoCorte = 0;
    rangoResiduo = 0;
    for (int i = 0; i < rango; i++){
        if (i >= inicio && i <= final){
            corteSonido[nuevoIndiceCorte] = sonido[i];
            rangoCorte++;
            nuevoIndiceCorte++;
        }
        else{
            residuoSonido[nuevoIndiceResiduo] = sonido[i];
            rangoResiduo++;
            nuevoIndiceResiduo++;
        }
    }
}
void pegarSonido(){
    int pegar;
    printf("Dónde pegar: ");
    scanf("%d", &pegar);
    int indice = 0;
    for (int i = 0; i < pegar; i++){
        sonido[indice] == residuoSonido[i];
        indice++;
    }
    for (int i = 0; i < rangoCorte; i++){
        sonido[indice] == corteSonido[i];
        indice++;
    }
    for (int i = pegar; i < rangoResiduo; i++){
        sonido[indice] == corteSonido[i];
        indice++;
    }
}
void main(){
    srand(time(NULL));
    int inicio, final, opcion, salir = 0;
    while (salir == 0){
        printf("1- Establecer rango de sonido\n");
        printf("2- Crear sonidos\n");
        printf("3- Visualizar sonidos\n");
        printf("4- Mezclar sonidos\n");
        printf("5- Cortar sonido\n");
        printf("6- Disminuir sonido\n");
        printf("7- Aumentar sonido\n");
        printf("8- Salir\n");
        printf("Ingrese una opción: ");
        scanf("%d", &opcion);

        switch (opcion)
        {
        case 1:
            printf("Ingrese el nuevo tamaño: ");
            scanf("%d", &rango);
            break;
        case 2:
            for (int i = 0; i < rango; i++)
                sonido[i] = (rand() % 100) + 1;
            break;
        case 3:
            imprimirSonido(rango, sonido);
            break;
        case 4:
            imprimirSonido(rango, sonido);
            printf("Ingrese el inicio: ");
            scanf("%d", &inicio);
            printf("Ingrese el final: ");
            scanf("%d", &final);
            imprimirSonido(rango, sonido);
            agregarVolumen(inicio, final);
            imprimirSonido(rango, sonido);
            break;
        case 5:
            imprimirSonido(rango, sonido);
            printf("Ingrese el inicio: ");
            scanf("%d", &inicio);
            printf("Ingrese el final: ");
            scanf("%d", &final);
            cortarSonido(inicio, final);
            imprimirSonido(rangoCorte, corteSonido);
            imprimirSonido(rangoResiduo, residuoSonido);
            imprimirSonido(rango, sonido);
            break;
        case 6:
            imprimirSonido(rango, sonido);
            disminuirVolumen();
            imprimirSonido(rango, sonido);
            break;
        case 7:
            imprimirSonido(rango, sonido);
            aumentarVolumen();
            imprimirSonido(rango, sonido);
            break;
        case 8:
            salir = 1;
            break;
        }
    }
}