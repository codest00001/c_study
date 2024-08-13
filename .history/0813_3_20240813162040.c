#include <stdio.h>
main(){
    int len = 0;
    char str[50];
    gets(str); //scanf와 같은 것임
    for (int i = 0; str[i]; i++)
    len += 1;
    printf("%d", len);
}