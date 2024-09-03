public class test2{
    public static void main(String[] args){
        String str = "1,2,3,4,,,5,6,7,,8,9";
        String[] splittest = str.split(",");

        for(int i = 0; i<splittest.length; i++) //,개수보다 하나 많은게 개수 12length가 됨.사이에 아무것도 없어도 아무것도 없는 걸 담는다.
        {
            System.out.print(splittest[i]);
            if ((i+1) % 3 == 0)
            System.out.println();
        }}}