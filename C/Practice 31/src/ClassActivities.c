#include "Utilities.h"
#include "Menu.h"
#include "ClassActivities.h"

#include <stdio.h>

#include <stdbool.h>

void FirstActClass(){
    int num1 = 0, num2 = 0, num3 = 0, repeat = 0;
    printf("How many times repeat this program : \n");
    scanf("%d", &repeat);

    for (int i = 0; i < repeat; i++)
    {
        printf("Input the first num : \n");
        scanf("%d", &num1);
        printf("Input the second num : \n");
        scanf("%d", &num2);
        printf("Input the third num : \n");
        scanf("%d", &num3);

        if (num1 > 10 && num1 < 20)
            printf("Sum of the 2nd y 3th number is: %d \n", num2 + num3);
        else if (num1 <= 10)
            printf("Rest of the 2nd y 3th number is: %d \n", num2 - num3);
        else if (num1 >= 20)
            printf("Mult of the 2nd y 3th number is: %d \n", num2 * num3);
    }
}

void SecondActClass(int num){
    int j = 0, num1 = 0, num2 = 0, num3 = 0;
    printf("Secuence for\n");
    for (int i = 1; i <= num; i++){
        printNumberString(i, num);
    }
    printf("Secuence while\n");
    while (j <= num){
        printNumberString(j, num);
        j += 2;
    }
    printf("Secuence retrospective\n");
    for (int k = num; k >= 1; k--){
        printNumberString(k, 1);
    }
    for (int z = 1; z <= num; z++){
        printNumberString(z, num);
    }

    printf("Input the first num : \n");
    scanf("%d", &num1);
    printf("Input the second num : \n");
    scanf("%d", &num2);
    printf("Input the third num : \n");
    scanf("%d", &num3);
    printf("Max: %d, Min: %d, Avarege: %d\n", max(max(num1, num2), num3),
           min(min(num1, num2), num3), (num1 + num + num3 / 3));
}


// ! IS PROGRAM 4 NEED 1 CLASS 3
// La empresa XYZ requiere de un programa que le ayude a calcular las vacaciones para sus empleados
// existen 3 tipos de empleados, gerentes, secretarias y oficinistas las vacaciones se calculan asi:

// ! IMPORTARNT TYPE EMPLOYEE
// El programa debe solicitar el tipo de empleado "G S O" y el tiempo laborado en dias, se debe imprimir cuantos dias de vaciones tiene o si no tiene derechos a ellos

// gerente dias>=1 && dias<3 = 3 dias
// getente dias>=3 && dias<5 = 7 dias
// gerente dias>=5 = 15 dias

// secretarias dias>=1 && dias<3 = 2 dias
// secretarias dias>=3 && dias<5 = 4 dias
// secretarias dias>=5 = 15 dias

// oficinista dias>=1 && dias<3 = 1 dia
// oficinista dias>=3 && dias<5 = 3 dias
// oficinista dias>=5 = 7 dias

void FourthActClass(){

}

// Se requiere un programa que calcule n^x

void FiveActClass(){

}