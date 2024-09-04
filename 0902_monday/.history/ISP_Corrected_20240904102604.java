public class ISP_Corrected {
    
    public static void main(String[] args) {
        SmartPrinter printer = new SmartPrinter();
        printer.print();
        printer.scan();
        printer.fax(); //팩스와 스캔을 합칠 수도 있음. 너무 많이 쪼개는 것 같으면.
    
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print();
        // basicPrinter.scan(); // Scan not supported 에러 발생
        // basicPrinter.fax();  // Fax not supported 에러 발생
    }

    // Print 기능을 위한 인터페이스
    interface Printer {
        void print();
    }

    // Scan 기능을 위한 인터페이스
    interface Scanner {
        void scan();
    }

    // Fax 기능을 위한 인터페이스
    interface Fax {
        void fax();
    }

    // 모든 기능을 지원하는 SmartPrinter 클래스
    static class SmartPrinter implements Printer, Scanner, Fax { 
        //implements 사용!! 
        // 다중상속 가능한 인터페이스의 속성임. 세개를 상속받을 수 있음.
        // 인터페이스말고 다른 경우는 다중상속 없음.
        @Override
        public void print() {
            System.out.println("Printing document...");
        }

        @Override
        public void scan() {
            System.out.println("Scanning document...");
        }

        @Override
        public void fax() {
            System.out.println("Sending fax...");
        }
    }

    // 오직 Print 기능만 지원하는 BasicPrinter 클래스
    static class BasicPrinter implements Printer{
        @Override
        public void print() {
            System.out.println("Printing document...");
        }
    }
}
