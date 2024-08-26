//c언어로 구현된 99를 넘지 않는 소수의 개수를 구하는 프로그램에서
//괄호에 들어갈 가장 적합한 변수나 조건식을 c언어 코드 형식으로 쓰시오.

#include <stdio.h>
int isprime(int number)
{
    int i;
    for(i = 2; i < number; i++)
    if(number % i  0)
    return 0;
    return 1;
}

int main(){
    int number = 99, cnt = 0, i;
    for (i=2; i<=number; i++)
    cnt = cnt + isprime(i);
    printf("%d를 넘지 않는 소수를 %d개 입니다.\n", number, cnt);
    return 0;
}