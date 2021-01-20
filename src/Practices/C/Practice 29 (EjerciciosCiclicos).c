#include <stdio.h>;
int main(){
    system("clear");
    Punto3();
    return 0;
}
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
        printf("Su suma es: %d\n",Suma);
        printf("Su producto es: %d\n\n",Producto);
        system("pause");
        system("clear");
    }
}