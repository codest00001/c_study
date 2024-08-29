public class java0829_2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("KOREA");
        sb.insert(3, "HRD"); //insert는 3이 인덱스 0123세고 3에 HRD를 추가한다. 
        System.out.println(sb.toString());
    }
}
