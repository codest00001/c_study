public class java0828_5 {
    public static void main(String[] args){
        char num = 0x06; //16진수 표시 b는 2진수
        System.out.printf("%04x", num << 2); //
        //%04x의 의미 나머지는0으로 채워 4자리확보 x 16진수 라는 의미
        //시프트는 2진수를 시프트하는 것임
    }
}
