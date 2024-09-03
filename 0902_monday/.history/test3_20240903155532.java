public class test3 {
    public static void main(String[] args){
        String str = "HELLO!@#WORLD/-";
        String res = str.replaceAll("[^ㄱ-하-ㅣ가-힣a-zA-Z0-9,.","*");
        System.out.print(res);
}
}
