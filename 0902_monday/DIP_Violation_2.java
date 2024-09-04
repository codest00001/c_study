public class DIP_Violation_2 {
    public static void main(String[] args) {
      PaymentProcessor paymentProcessor = new PaymentProcessor();
      paymentProcessor.processPayment();
    }
  
    // 저수준 모듈: CreditCard
    static class CreditCard {
      public void makePayment() {
        System.out.println("Payment made with credit card.");
      }
    }
    // 저수준모듈추가 CreditCard_cash//
    static class CreditCard_cash {
        public void makePayment() {
          System.out.println("Payment_cash made with credit card.");
        }
      }
  
    // 고수준 모듈: PaymentProcessor
    static class PaymentProcessor {
      private CreditCard creditCard;
      private CreditCard_cash creditCard_cash;//
  
      public PaymentProcessor() {
        this.creditCard = new CreditCard(); // 저수준 모듈에 직접 의존
        this.creditCard_cash = new CreditCard_cash(); // 추가
     

  
      public void processPayment() {
        creditCard.makePayment(); // 저수준 모듈의 메서드 사용
        creditCard_cash.makePayment(); // 저수준 모듈의 메서드 사용추가//
      }
     
    }
  }
  //DIP 위반 케이스