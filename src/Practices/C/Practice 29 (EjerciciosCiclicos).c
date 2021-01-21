#include <stdio.h>

void Punto1(){
    int i = 1;
    while (i <= 20){
        if (i%2==0){
            printf("numero par %d\n",i);
        }
        i++;
    }
}
void Punto2(){
    int Entrada = 0;
    do{
        printf("Introduzca un numero\nSi desea salir digite \"20\"\n");
        scanf("%d",&Entrada);
        if (Entrada==0) printf("%d es un numero neutro\n",Entrada);
        else if (Entrada>0) printf("%d es un numero positivo\n",Entrada);
        else printf("%d es un numero negativo\n",Entrada);
        system("pause");
        system("clear");
    } while (Entrada != 20);
}
void Punto3(){
    int Input = 0;
    int Suma = 0;
    int Producto = 1;
    while (Input != 999){
        printf("Digite '999' para salir\nDigite un numero: ");
        scanf("%d",&Input);
        if (Input%2==0) Suma += Input;
        if (Input%5==0) Producto *= Input;
        printf("Su suma es: %d\nSu producto es: %d\n\n",Suma,Producto);
        system("pause");
        system("clear");
    }
}
void Punto4(){
    char* MesesNombres[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    int MesesDinero[12];
    int DineroAno = 0;
    for (int i = 0; i < 12; i++){
        printf("¿Cuanto dinero ahorrastes en %s?: ",MesesNombres[i]);
        scanf("%d",&MesesDinero[i]);
        DineroAno += MesesDinero[i];
    }
    system("clear");
    for (int i = 0; i < 12; i++){
        printf("%s: %d\n",MesesNombres[i], MesesDinero[i]);
    }
    printf("Dinero ahorrado de todo el año: %d",DineroAno);
}

int main(){
    system("clear");
    Punto4();
    return 0;
}