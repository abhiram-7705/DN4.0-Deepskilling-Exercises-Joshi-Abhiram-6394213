public class CardAdapter implements PaymentProcessor{
    
    CardPayment card;
    public CardAdapter()
    {
        card=new CardPayment();
    }

    public void processPayment() {
        card.processPayment();
    }
    
}
