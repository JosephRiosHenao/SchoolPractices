#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

void point1(){
    float v0,vf,t,d,v;
    printf("\n\nTODOS LOS DATOS DEBEN SER EN m/s\n");
    printf("d = ( (vf + v0) / 2) t\n");
    printf("Digite la velocidad final: ");
    scanf("%f",&vf);
    printf("\nDigite la velocidad inicial: ");
    scanf("%f",&v0);
    printf("%.3lf\n",d);
}
void point2(){
    float a,vf,v0,t,v;
    printf("\n\nTODOS LOS DATOS DEBEN SER EN m/s\n");
    printf("a = (vf - v0)/t\n");
    printf("d = ( (vf + v0) / 2) t\n");
    printf("Digite la velocidad final: ");
    scanf("%f",&vf);
    printf("\nDigite la velocidad inicial: ");
    scanf("%f",&v0);
}
void point3(){
    float m1,vf,v0,tf,t0,t,v;
    printf("\n\nTODOS LOS DATOS DEBEN SER EN m/s\n");
    printf("m1 = (vf - v0) / (tf - t0)\n");
    printf("d = ( (vf + v0) / 2) t\n");
    printf("Digite la velocidad final: ");
    scanf("%f",&vf);
    printf("\nDigite la velocidad inicial: ");
    scanf("%f",&v0);
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
        printf("Digite lo que quiere hallar\n1.Desplazamiento\n2.Acelerracion\n3.Pendiente\n4.Salir\n");
        scanf("%d",&optionSelect);
        system("clear");
        if (optionSelect>0 && optionSelect<5) eleccion(optionSelect);
        else printf("\nDigite una opcion valida\n");    
    }
}
int main(){
    menu();
    return 0;
}

