public class DIP_Corrected2 {
    public static void main(String[] args) {
        // 기존의 카드 결제 처리 //creditCard라는 변수임
        PaymentMethod creditCard = new CreditCard();
        PaymentProcessor creditCardProcessor = new PaymentProcessor(abcCard);
        creditCardProcessor.processPayment();

        // ABC 카드 결제 처리
        PaymentMethod abcCard = new ABC_Card(); //abcCard라는 변수임
      
    }

    // 추상화 : PaymentMethod 인터페이스 정의
    interface PaymentMethod {
        void makePayment();
    }

    // 기존 저수준 모듈 : CreditCard 클래스
    static class CreditCard implements PaymentMethod {
        @Override
        public void makePayment() {
            System.out.println("Payment made with credit card.");
        }
    }






    // 고수준 모듈 : PaymentProcessor 클래스
    static class PaymentProcessor {
        private PaymentMethod paymentMethod;

        public PaymentProcessor(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;  // 인터페이스를 통해 의존성 주입
        }

        public void processPayment() {
            paymentMethod.makePayment();  // 인터페이스의 메서드 호출
        }
    }
}
