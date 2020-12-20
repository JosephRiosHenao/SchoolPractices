#include <stdio.h>

extern int x,y;
extern char ch;
int main()
{
    func();
    return 0;
}
void func()
{
    x = y/10;
    printf("%d",x);
}