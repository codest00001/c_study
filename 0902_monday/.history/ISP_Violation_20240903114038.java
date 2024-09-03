public class ISP_Violation {
    public static void main(String[] args){
        SmartPrinter printer = new SmartPrinter();
        printer.print();
        printer.scan();
        printer.fax();

        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print();
        // basicPrinter.scan(); //컴파일 오류 : BasicPrinter는 scan 메서드를 구현할 수 없음
        // basicPrineter.fax(); //컴파일오류 : BasicPrinter는 fax 메서드를 구현할 수 없음

        interface MultiFunctionDevice{
            void print();
            void scan();
            void fax();
}
