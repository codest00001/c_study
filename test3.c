// #include <stdio.h>
// int main(){
//     printf("%d", -5 & 7);
//     return 0;
// }

// #include <stdio.h>
// int main(){
//     printf("%d", sizeof(12));
//     return 0;
// }


// #include <stdio.h>
// int main(){
//     printf("%d\n", sizeof(12.3));
//     printf("%d", sizeof(char));
//     return 0;
// }


// #include <stdio.h>
// int main()
// {
//     int num;
//     scanf("%d", &num);
//     switch (num) {
//         case 1 : 
//             printf("1을 입력\n");
//             break;
//         case 2 : 
//             printf("2을 입력\n");
//             break;
//         case 3 : 
//             printf("3을 입력\n");
//             break;
//         default :
//             printf("입력 오류\n");
//             break;
//     }
//     return 0 ;
// }

// #include <stdio.h>
// int main(){
//     int i, j;
//     for (i=2; i<=4;i++){
//         for (j=5;j<=7; j++){
//         }
//     }
//     printf("%d x %d = %2d", j, i, i*j);
// }

#include <stdio.h>
int main() {
    int a;
    printf("정수입력 enter please : ");
    scanf("%d", &a);
    if ( a % 3 == 0 && a % 7 == 0)
    printf("3의 배수이면서 7의 배수임 : yes\n");
    else
    printf("3의 배수이면서 7의 배수가 아님 : no\n");
    ;
}