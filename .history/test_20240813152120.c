// // #include <stdio.h>

// // int main() {
// //     int num;
// //     num = 0x10;
// //     printf("%d", num);
// //     }

// // #include <stdio.h>
// // int main(){
// //     char str[1];
// //     printf("enter your name : ");
// //     scanf("%s", str);
// //     printf("Welcome %s", str);
// // }

// #include <stdio.h>
// int main(){
//     char str[1];
//     printf("enter your name : ");
//     scanf("%s", str);
//     printf("Welcome %s", str);
// }

// #include <stdio.h>
// int main() {
//     int num = 1640;
//     printf("%d", num >> 3);
// }

// #include <stdio.h>
// int main() {
//     int num = 1640;
//     printf("%d", num << 3);
// }

// #include <stdio.h>
// int main()
// {
//     int a = 15;
//     printf("%o", a);
//     return 0;
// }

// #include <stdio.h>
// int main(void){
//     int i = 200;
//     float a = 12.456f;

//     i = (int) a;
//     printf("%d, %3.2f", i, a);
//     return 0;
// }

#include <stdio.h>
int main(void){
    int i = 200;
    float a = 123.456f;

    i = (int) a;
    printf("%d, %7.2f", i, a);
    return 0;
}