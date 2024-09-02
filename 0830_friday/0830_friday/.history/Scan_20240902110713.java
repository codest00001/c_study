import java.util.Scanner;

public class Scan {
    Scanner sc = new Scanner(System.in);

    int returnInt() {
        System.out.print("숫자를 입력해주세요 : ");
        return sc.nextInt();
    }
}

public class Repeater {
    // Scan 클래스를 멤버 변수로 사용
    public Scan scan = new Scan();

    public void repeat() {
        int count = 0;
        int max = scan.returnInt();
        while (count < max) {
            System.out.println("안녕하세요");
            count++;
        }
    }
}
