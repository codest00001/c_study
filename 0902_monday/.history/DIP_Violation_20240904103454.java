public class DIP_Violation {
    public static void(String[] args){
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment();
        }

        //저수준 모듈 : CreditCard
        static class CreditCard{
            public void makePayment(){
                System.out.println("Payment made with credit card")
            }}

        public String[] getArgs() {
            return args;
        }

        public void setArgs(String[] args) {
            this.args = args;
        }
            
