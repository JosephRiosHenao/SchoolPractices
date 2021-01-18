#include <stdlib.h>
#include <stdio.h>

int main()
{
    int a = 1;
    char b;
    do {
        printf("Digite la \'A\'\n");
        scanf("%c", &b);
        if (b == 'A'){
            printf("Se forzara salida");
            exit(1);
        }else{
            printf("Digite correctamente\n");
        }
    } while (a != 1)
    return 0;
}