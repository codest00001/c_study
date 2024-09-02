interface Cals {
    // 반환형을 반드시 지정해야 합니다.
    public void get(int v);
}

class Test implements Cals {
    public void get(int v) {
        System.out.print(v*v);
    }
}

public class main{
    public static void main(String[] args) {
        Cals a = new Test();
        a.get(10);
    }
}
