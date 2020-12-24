#include <string.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main()
{
    int Eleccion;
    char s1;
    const char s2 = "Nice";
    while (true)
    {
        system("clear");
        printf("S1:%s S2:%s\nstrcpy:%s\nstrcat:%s\nstrlen:%d\nstrcmp:%d\n1.Devolver\n2.Concatenar\n3.Longitud\n4.ComparadorBIT\n5.CambiarCadenas\n6.Salir\n",s1,s2,strcpy,strcat,strlen,);
        scanf("%d",&Eleccion);
        system("clear");
        switch (Eleccion)
        {
            case 1:
                char *strcpy(*s1,*s2);
            break;
            case 2:
                char *strcat(*s1,*s2);
            break;
            case 3:
                int strien(const char *s1);
            break;
            case 4:
                int strcmp(const char *s1,const char *s2);
            break;
            case 5:
                printf("Digite el valor de s1\n");
                scanf("%d",&s1);
                printf("Digite el valor de s2\n");
                scanf("%d",&s2);
            break;
            case 6:
                exit(1);
            break;
            default:
                printf("Digite una opcion valida\n");
                system("pause");
        }
    }
    return 0;
}