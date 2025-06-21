public class Test {
    public static void main(String[] args) {

        System.out.println("Credit Card payment demo");
        PaymentContext context1=new PaymentContext(new CreditCardPayment());
        context1.makePayment();

        System.out.println("PayPal payment demo");
        PaymentContext context2=new PaymentContext(new PayPalPayment());
        context2.makePayment();
    }
}
