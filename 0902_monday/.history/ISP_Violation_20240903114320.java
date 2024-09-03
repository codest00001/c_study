public class ISP_Violation {

    public static void main(String[] args) {
      SmartPrinter printer = new SmartPrinter();
      printer.print();
      printer.scan();
      printer.fax();
  
      BasicPrinter basicPrinter = new BasicPrinter();
      basicPrinter.print();
      // basicPrinter.scan(); // 컴파일 오류: BasicPrinter는 scan 메서드를 구현할 수 없음
      // basicPrinter.fax(); // 컴파일 오류: BasicPrinter는 fax 메서드를 구현할 수 없음
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
  
  //ISP 위배 케이스