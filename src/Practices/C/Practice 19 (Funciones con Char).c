#include <string.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main()
{
    int Eleccion;
    char s1[30];
    char s2[30];
    printf("Digite el valor de s1\n");
    scanf("%s",&s1);
    printf("Digite el valor de s2\n");
    scanf("%s",&s2);
    system("clear");
    while (true)
    {
        system("clear");
        printf("String 1:%s\nLongitud:%d\nString 2:%s\nLongitud:%d\n1.Cambiar Strings\n2.Salir\n",s1,strlen(s1),s2,strlen(s2));
        scanf("%d",&Eleccion);
        system("clear");
        switch (Eleccion)
        {
            case 1:
                printf("Digite el valor de s1\n");
                scanf("%s",&s1);
                printf("Digite el valor de s2\n");
                scanf("%s",&s2);
            break;
            case 2:
                exit(1);
            break;
            default:
                printf("Digite una opcion valida\n");
                system("pause");
        }
    }
    return 0;
}