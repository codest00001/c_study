// 다음은 5개의 정수를 입력받아 그 중 홀수의 개수를 구하여 출력하는 알고리즘을 c언어로 구현한 코드이다.
// 프로그램을 분석하여 괄호에 들어갈 가장 적합한 답을 쓰시오.

#include <stdio.h>
int main(){
    int i, a[5], cnt = 0;
    for (i = 0; i < 5; i++)
    scanf("%d", &a[i]);
    for (i = 0; i<5; i++){
        if (a[i] % 2 > 0) // >도 답이됨. 2로나눈 나머지가 0보다 크려면 1이니까
        cnt = cnt + 1;
    }
    printf("홀수의 개수 : %d개", cnt);
}