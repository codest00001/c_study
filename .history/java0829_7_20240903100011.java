import java.util.Scanner;

public class java0829_7 {
    public class Problem {
        int inNum;
        Scanner scan01 = new Scanner(System.in);inNum=scan01.nextInt();if(inNum%2==0)System.out.printf("%d=jjak.\n",inNum);else System.out.printf("%d=hol.\n",inNum);scan01.close();
    }
}
