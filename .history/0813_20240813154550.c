#include <stdio.h>
int main() {
    int i, a[5], temp; //a[5] 배열a에 다섯개의 요소가 들어간다
    for (i=0; i<5; i++) {
        a[i]=i+1;
        printf("%d", a[i]);
    }
    printf("\n"); //12345
    temp = a[0]; //temp에 1을 저장
    for (i=0; i<4; i++) { //
        a[i]=a[i+1];
    }
        a[4] = temp; //배열의 다섯번째 요소
        for (i=0; i<5; i++) {
            printf("%d", a[i]);
        }
}

