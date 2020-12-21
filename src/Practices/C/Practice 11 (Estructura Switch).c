#include <stdio.h>

int main()
{
    int Eleccion;
    printf("--Menu--\n1.Opcion1\n2.Opcion2\n3.Opcion3\n4.Opcion\n");
    scanf("%d", &Eleccion);
    switch (Eleccion){
        case 1:
            printf("Estas en la opcion 1");
        break;
        case 2:
            printf("Estas en la opcion 2");
        break;
        case 3:
            printf("Estas en la opcion 3");
        break;
        case 4:
            printf("Estas en la opcion 4");
        break;
        default:
            printf("Estas en el default");
    }
    return 0;
}