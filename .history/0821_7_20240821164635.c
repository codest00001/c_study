#include <stdio.h>
int hrd(num){
    if (num <= 0)
        return;
    printf("%d ", num);  //%d뒤에 공백이 있음을 주의하자! 출력시에 한 칸 씩 띄어야 함!
    hrd(num - 1);
}
int main (){
    hrd(5);
    return 0;
}