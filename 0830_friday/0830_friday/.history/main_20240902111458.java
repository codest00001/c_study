import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Repeater 클래스의 인스턴스를 생성하고 repeat 메서드를 호출합니다.
        Repeater repeater = new Repeater();
        repeater.repeat();
    }
}
class Scan {
    Scanner sc = new Scanner(System.in);
    int returnInt() {
        System.out.print("숫자를 입력해주세요 : ");
        return sc.nextInt();
    }
}
class Repeater {
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
