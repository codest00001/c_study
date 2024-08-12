// #include <stdio.h>
// int main()
// {
//     double num = 0.01;
//     double res = 0; //double타입이니까 0.0 100번돌고 1.0이 되므로 1과 다름
//     int cnt = 0;
//     while(cnt < 100)
//     {
//         res += num;
//         cnt++;
//     }
//     printf(res == 1.0 ? "true" : "false");

//     return 0;
// }


// #include <stdio.h>
// int main() {
//     int num = 1 ;
//     for (int i = 1;  ; i++){
//         num = num * i;
//         if ( i > 5 )
//             break;
//     }
//     printf("%d", num);
// }

#include <stdio.h>
#define N 100
int main(){
    int i = 1;
    int cnt = 0;

    while (i <= N) {
        if ((i %3) == 0 && (i%7) == 0){
            cnt++;
            printf("%d*%d*", cnt, i);
        }
        i++;
    }
}
