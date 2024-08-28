public class Test0828_1 {
    public static void main(String[] args) {
        Otest ot = new Otest();
        ot.cat();
        ot.cat("4");
    }
}

class Otest{
    void cat() {
        System.out.println("1234");
    }
    void cat(int c) {
        System.out.print(++c);
    }
    void cat(String c){
        System.out.println("munja");;
    }
}
