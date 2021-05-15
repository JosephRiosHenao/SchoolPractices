#include <stdio.h>

int main()
{
    int num1, num2, result;
    printf("Ingrese el primer valor\n");    
    scanf("%d",&num1);
    printf("Ingrese el segundo valor\n");
    scanf("%d",&num2);
    result = num1 - num2;
    printf("\nLa resta es %d\n",result);    
    return 0;
}