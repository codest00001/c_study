import java.lang.*;
public class Main{
    public static void main(String[] args){
        switch((int)Math.signum(-100)) {
            case -1:
                System.out.print("N");
                break;
            case 0 :
                System.out.print("P");
                break;