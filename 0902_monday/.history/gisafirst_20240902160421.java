public class gisafirst{
    public static void main(String[] args){
        int num1 = 3;
        int num2 = 7;
        if (++num1 <= 5 || num2++ >= 5) 
        // || or 연산자 일때 먼저 나온게 참이 되어버리면
        // 뒤쪽 계산은 아예 안하고 아래로 내려와 버림!!!(원칙이므로 알아두기!)
        // 왜냐면 이미 앞에서 1이 나왔으므로 무조건 트루일테니까.
        // 앞이 0 이면 || 다음의 계산을 진행함.
        // 알아두기!!!
            System.out.println(num1);
        System.out.println(num2);
    }}