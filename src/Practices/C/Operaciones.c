#include <stdio.h>

int main()
{
    int num1;
    int num2;
    int result;
    printf("Ingrese el primer valor\n");    
    scanf("%d",&num1);
    printf("Ingrese el segundo valor\n");
    scanf("%d",&num2);
    result = num1 / num2;
    printf("\nLa suma es %d\n",result);    
    return 0;
}