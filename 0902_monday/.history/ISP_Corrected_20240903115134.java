//인터페이스는 다중상속이 가능. ,로 추가 가능
public class ISP_Corrected {
    
    public static void main(String[] args) {
        SmartPrinter printer = new SmartPrinter();
        printer.print();
        printer.scan();
        printer.fax();
    
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print();
        // basicPrinter.scan(); // 둘다 주석 지워도 스캔에러메시지만 먼저 나옴. 내가 적어놓은 에러메시지 뜸.Scan not supported 컴파일 오류: BasicPrinter는 scan 메서드를 구현할 수 없음
        // basicPrinter.fax(); // 내가 적어놓은 에러메시지 뜸. 컴파일 오류: BasicPrinter는 fax 메서드를 구현할 수 없음
      }
    
      interface MultiFunctionDevice {
        void print();
    
        void scan();
    
        void fax();
      }
    
      static class SmartPrinter implements MultiFunctionDevice {
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
    
      static class BasicPrinter implements MultiFunctionDevice {
        @Override
        public void print() {
          System.out.println("Printing document...");
        }
    
        @Override
        public void scan() {
          // BasicPrinter는 scan 기능을 지원하지 않음
          throw new UnsupportedOperationException("Scan not supported");
        }
    
        @Override
        public void fax() {
          // BasicPrinter는 fax 기능을 지원하지 않음
          throw new UnsupportedOperationException("Fax not supported");
        }
      }
    }
