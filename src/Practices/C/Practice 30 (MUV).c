#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

void point1(){
    printf("TODOS LOS DATOS DEBEN SER EN m/s\n");
    float v0,v1,s,d;
    v0 = 5.6676;
    v1 = 32.434343;
    d = v1 + v0;
    printf("%.3lf\n",d);
}
void point2(){
    printf("punto2");
}
void point3(){
    printf("punto3");
}
void eleccion(int option){
    switch (option){
        case 1: point1();
        break;
        case 2: point2();
        break;
        case 3: point3();
        break;
        case 4: exit(1);
        break;
        default: printf("Error 1\n"); //Error 1, no deberias estar aqui
    }
}
void menu(){
    int optionSelect;
    while (true){
        printf("Digite lo que quiere hallar\n1.Desplazamiento\n4.Salir\n");
        scanf("%d",&optionSelect);
        if (optionSelect>0 && optionSelect<5) eleccion(optionSelect);
        else printf("\nDigite una opcion valida\n");    
    }
}
int main(){
    menu();
    return 0;
}

