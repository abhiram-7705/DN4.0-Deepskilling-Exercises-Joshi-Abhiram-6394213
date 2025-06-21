public class CashAdapter implements PaymentProcessor{

    CashPayment cash;
    public CashAdapter()
    {
        cash=new CashPayment();
    }

    public void processPayment() {
        cash.processPayment();
    }
    
}
