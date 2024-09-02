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
