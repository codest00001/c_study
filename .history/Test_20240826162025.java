//자바 문제 1
//자바에서는 배열에 아무 값도 없으면 0으로 채워진다.
//자바 파일 이름은 class의 이름으로 자동으로 지정된다. 
//class이름을 변경하면 파일 이름도 자동으로 변경된다.

public class Test {
    public static void main(String[] args){
        int i;
        int num[] = {2,1,3,7,4,9};
        int numb[] = new int[10];
        for (i = 0; i<num.length; i++)
        numb[i] = num[i];
        for (i=0; i<numb.length; i++)
        System.out.printf("%d", numb[i]);
    }
}
