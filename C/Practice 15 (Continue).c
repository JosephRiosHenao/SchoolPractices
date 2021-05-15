#include <stdio.h>

int main()
{
    int Numero;    
    while (Numero!=0){
        printf("Digite el 1\n");
        scanf("%d",&Numero);
        if (Numero == 1) continue;
        printf("GG no continuo\n");
    }    
    return 0;
}