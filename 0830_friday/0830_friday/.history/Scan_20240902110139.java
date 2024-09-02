import java.util.Scanner;

public class Scan {
    Scanner sc = new Scanner(System.in);

    int returnInt() {
        System.out.print("숫자를 입력해주세요 : ");
        return sc.nextInt();
    }
}