public class java0828_7 {
public static void main(String [] args){
    int sum = 0;
    for (int i = 0; i < 10; i++){
        if (i%2 ==0)
        { sum = i + sum }
    }
    System.out.println("짝수의 합 = " + sum);
}
}