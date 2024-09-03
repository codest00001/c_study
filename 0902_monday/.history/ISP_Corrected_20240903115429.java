public class ISP_Corrected {
    
    public static void main(String[] args) {
        SmartPrinter printer = new SmartPrinter();
        printer.print();
        printer.scan();
        printer.fax();
    
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
    static class BasicPrinter implements Printer {
        @Override
        public void print() {
            System.out.println("Printing document...");
        }

        @Override
        public void scan() {
            System.out.println("Scanning document...");
        }
    }
}
