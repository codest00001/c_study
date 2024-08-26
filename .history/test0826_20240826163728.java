public class test0826 {
    public static void main(String[] args){
        String weeks[] = {"mon월요일", "tue화요일","wed수요일","thr목요일","fri금요일","sat토요일","sun일요일"};
        int cnt = 1;
        for(int i = 1; i < 7 ; i++){
            if (i%3 == 0)
                break;
            cnt++;
        }
        System.out.print("오늘은 " + weeks[cnt]);
    }
}
