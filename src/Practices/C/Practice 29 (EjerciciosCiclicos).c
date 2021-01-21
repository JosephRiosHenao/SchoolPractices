#include <stdio.h>
#include <stdlib.h>
#include <string.h>
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
void Punto5(){
    char Color[100];
    while (strcmp(Color,"BLUE") != 0){
        printf("Para salir digite 'BLUE'\nDigite un color: ");
        scanf("%s",Color);
        printf("Color = %s\n\n",Color);
    }
}
void Punto6(){
    int seleccion = 0;
    for (int i = 1; i <= 5; i++){
        printf("PERSONA #%d\n\n1.Bogota\n2.Medellin\n3.Cali\nDigite su ciudad favorita: ",i);
        scanf("%d", &seleccion);
        system("clear");
        switch (seleccion){
            case 1:
                printf("Vamos a comenzar hablando de Bogotá, capital de la República de Colombia y del departamento\nde Cundinamarca, además de ser el epicentro político, administrativo, económico, industrial,\nartístico, cultural, deportivo y, por supuesto, turístico del país. Se trata de una ciudad diversa y\nmulticultural en la que se combinan las construcciones modernas con las del pasado colonial.\nAdemás, es importante tener en cuenta que gracias a sus cerros y a sus parques, es una ciudad\nverde.");
                system("pause");
                system("clear");
            break;
            case 2:
                printf("La segunda ciudad más poblada de Colombia es Medellín, capital del departamento de\nAntioquia. Situada en la cordillera central de los Andes, es un destino ideal para hacer\nsenderismo, tirolina y montar a caballo. Además, los turistas podrán disfrutar de unas\nvacaciones llenas de cultura.");
                system("pause");
                system("clear");
            break;
            case 3:
                printf("Tras Medellín, la ciudad más poblada de Colombia es Cali, cuyo nombre oficial es Santiago de\nCali. Se trata de la capital del departamento del Valle del Cauca y está considerada como una de\nlas ciudades más antiguas de América. Por otro lado, debes saber que se trata de uno de los\nprincipales centros económicos e industriales del país.");
                system("pause");
                system("clear");
            break;
            default:
                printf("Al no digitar una opcion valida, Se procedera con la persona %ddo\n",i+1);
                system("pause");
                system("clear");
            break;
        }
    }
}
int main(){
    system("clear");
    Punto6();
    return 0;
}