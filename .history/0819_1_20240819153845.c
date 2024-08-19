#include <stdio.h>
#include <string.h>
int main()
{
    int k, n;
    char st[] = "I am Tom!";
    char temp;
    n = strlen(St);
    n--;
    for (k=0 ; k<n ; k++)
    {
        temp = *(st + k);
        *(st + k) = *(st + n);
        *(st + n) = temp;
        n--;
    }
    printf("%s\n", st);
}