public class java0828_1 {
    public static void main(String[] args) {
        Otest ot = new Otest();
        ot.cat();
        ot.cat("4");
    }
}

class Otest{ //메서드이름은 같게 할 수 있음. cat. 이 경우는오버라이딩은 아님. 오버라이딩은 위의 것 무시. // 이 경우는 중복정의. 오버로딩이라고 함. (면접질문가능. 오버라이딩과 오버로딩)
    void cat() {
        System.out.print("1234");
    }
    void cat(int c) {
        System.out.print(++c);
    }
    void cat(String c){
        System.out.print("munja");;
    }
}
