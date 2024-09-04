public class DIP_Corrected_Ori {
    public static void main(String[] args) {
      PaymentMethod creditCardPaymentMethod = new CreditCard(); // 고수준 모듈은 인터페이스에 의존
      PaymentProcessor creditCardPaymentProcessor = new PaymentProcessor(creditCardPaymentMethod);
      creditCardPaymentProcessor.processPayment();
    }
  
    // 추상화: PaymentMethod 인터페이스
    interface PaymentMethod {
      void makePayment();
    }
  
    // 저수준 모듈: CreditCard (인터페이스를 구현)
    static class CreditCard implements PaymentMethod {
      @Override
      public void makePayment() {
        System.out.println("Payment made with credit card.");
      }
    }
  
    // 고수준 모듈: PaymentProcessor (인터페이스에 의존) : 고수준 모듈은 신규 카드가 추가되더라도 변경이 없음
    static class PaymentProcessor {
      private PaymentMethod paymentMethod;
  
      public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod; // 인터페이스를 통해 의존성 주입
      }
  
      public void processPayment() {
        paymentMethod.makePayment(); // 인터페이스의 메서드 호출
      }
    }
  }
  
  //DIP 준수 케이스