public class Test {
    public static void main(String[] args) {
        
        PaymentProcessor cash=new CashAdapter();
        System.out.println("initiating cash payment");
        cash.processPayment();

        PaymentProcessor card=new CardAdapter();
        System.out.println("initiating card payment");
        card.processPayment();

        PaymentProcessor upi=new UPIAdapter();
        System.out.println("initiating upi payment");
        upi.processPayment();

    }
}
