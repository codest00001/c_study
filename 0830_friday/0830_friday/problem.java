public class problem {
    public static void main(String[] args) {
        int i = 0, hap = 0;
        for (i = 1; i <= 5; ++i, hap += i)
            System.out.printf("total%d %4dimnida.\n", i, hap);
    }
}
// 처음에 i = 1하고 i<=5해서 바로 밑으로가고
// ++i하고 hap계산하고 다시 i<=5로 비교문실행