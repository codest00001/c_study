public class DIP_Corrected {
        public static void main(String[] args){
            PaymentMethod2 paymentMethod2 = new ABC_Card();  // ABC_Card 객체를 생성하고, PaymentMethod 인터페이스 타입 변수에 할당
            PaymentMethod paymentMethod = new CreditCard();
            
            //카드 객체 생성 및 결제 인터페이스 변수에 담음
            //결제 인터페이스 변수를 파라미터로 전달해, 결제 모듈 객체 생성 및 할당
            PaymentProcessor paymentProcessor = new PaymentProcessor(paymentMethod);
            //결제 모듈의 결제 메서드 실행
            paymentProcessor.processPayment();
        }
        //추상화 : PaymentMethod 인터페이스 정의
        interface PaymentMethod{
            void makePayment();
        }

        //저수준 모듈 : CreditCard (인터페이스를 구현)
        static class CreditCard implements PaymentMethod {
            @Override
            public void makePayment(){
                System.out.println("Payment made with credit card.");
            }

            
}

static class ABC_Card implements PaymentMethod {
    @Override
    public void makePayment() {
        System.out.println("Payment made with ABC card.");
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