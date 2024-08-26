public class test0826 {
    public static void main(String[] args){
        String weeks[] = {"monday월요일", "tuesday화요일","wednesday수요일","thursday목요일","friday금요일","saturday토요일","sunday일요일"};
        int cnt = 1;
        for(int i = 1; i < 7 ; i++){
            if (i%3 == 0)
                break;
            cnt++;
        }
        System.out.print("today is 오늘은 " + weeks[cnt]);
    }
}
