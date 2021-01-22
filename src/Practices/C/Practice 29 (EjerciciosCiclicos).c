#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
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
void Menu(){
    int menu = 0;
    while(true){
        system("clear");
        printf("MENU\n\n1.Punto1 (Numero pares de 0 a 20)\n2.Punto2 (Detectar valor de numero)\n3.Punto3 (Sumar pares y multiplicar multiplos de 5)\n4.Punto4 (Dinero ahorrado en el año)\n5.Punto5 (Digitador de colores)\n6.Punto6 (Ciudades de Colombia)\n7.Salir\n\n");
        printf("Digite una opcion: ");
        scanf("%d",&menu);
        switch (menu){
            case 1:
                esperarTecla();
                Punto1();
                system("pause");
            break;
            case 2:
                esperarTecla();
                Punto2();     
                system("pause");
            break;
            case 3:
                esperarTecla();
                Punto3();            
            break;
            case 4:
                esperarTecla();
                Punto4(); 
                system("pause");    
            break;
            case 5:
                esperarTecla();
                Punto5();            
            break;
            case 6:
                esperarTecla();
                Punto6();
            break;
            case 7:
                exit(1);
            break;
            default:
                printf("\n\nDigite una opcion valida\n\n");
                esperarTecla();
            break;
        }
    }
}
void esperarTecla(){
    system("pause");
    system("clear");
}
int main(){
    system("clear");
    Menu();
    return 0;
}