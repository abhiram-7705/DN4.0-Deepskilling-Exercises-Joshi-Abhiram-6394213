public class PaymentContext {
    PaymentStrategy payment;

    public PaymentContext(PaymentStrategy p)
    {
        payment=p;
    }

    public void makePayment()
    {
        payment.pay();
    }

}
