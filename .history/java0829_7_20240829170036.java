import java.util.Scanner;

public class Java0829_7 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scan01 = new Scanner(System.in);

        // 사용자로부터 정수 입력 받기
        System.out.print("정수를 입력하세요: ");
        int inNum = scan01.nextInt();

        // 홀수/짝수 판별 및 출력
        if (inNum % 2 == 0) {
            System.out.printf("%d = 짝수입니다.\n", inNum);
        } else {
            System.out.printf("%d = 홀수입니다.\n", inNum);
        }

        // Scanner 객체 닫기
        scan01.close();
    }
}
