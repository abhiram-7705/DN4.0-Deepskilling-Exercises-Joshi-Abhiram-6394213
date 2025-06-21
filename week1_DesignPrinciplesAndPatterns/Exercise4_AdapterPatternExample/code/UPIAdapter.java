public class UPIAdapter implements PaymentProcessor{
    
    UPIPayment upi;
    public UPIAdapter()
    {
        upi=new UPIPayment();
    }
    public void processPayment() {
        upi.processPayment();
    }
}
