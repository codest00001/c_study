public class DIP_Corrected {
    public class DIP_Corrected{
        public static void main(String[] args){
            PaymentMethod paymentMethod = new CreditCard(); //카드 객체 생성 및 결제 인터페이스 변수에 담음
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
