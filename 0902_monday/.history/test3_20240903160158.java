public class test3 {
    public static void main(String[] args){
        String str = "HELLO!@#WORLD/-";
        String res = str.replaceAll("[ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9,.]","*"); 
        //^ :아닌 것 // ㄱ부터 ㅎ까지,ㅏ 부터 ㅣ까지, 가부터 힣까지, a부터 z까지 A부터 Z까지, 0부터 9까지, 쉼표(,), 마침표(.)가 아닌 것(^)
        System.out.print(res);
}
}