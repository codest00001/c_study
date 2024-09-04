public class DIP_Corrected2 {
    public static void main(String[] args){
        PaymentMethod paymentMethod = new ABC_Card();  // ABC_Card 객체를 생성하고, PaymentMethod 인터페이스 타입 변수에 할당
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentMethod);
        paymentProcessor.processPayment();
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

    // 새로운 저수준 모듈 : ABC_Card 클래스 추가
    static class ABC_Card implements PaymentMethod {
        @Override
        public void makePayment() {
            System.out.println("Payment made with ABC card.");
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
