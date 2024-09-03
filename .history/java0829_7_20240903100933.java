import java.util.Scanner;

public class java0829_7 {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner scan01 = new Scanner(System.in);

        // 사용자 입력 받기
        int inNum = scan01.nextInt();

        // 입력된 숫자가 짝수인지 홀수인지 확인
        if (inNum % 2 == 0) {
            System.out.printf("%d=jjak.\n", inNum);
        } else {
            System.out.printf("%d=hol.\n", inNum);
        }

        // 스캐너 객체 닫기
        scan01.close();
    }
}
