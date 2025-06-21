public class SMSNotifierDecorator extends NotifierDecorator{

    public SMSNotifierDecorator(Notifier obj)
    {
        super(obj);
    }
    public void send() {
        obj.send();
        System.out.println("adding new SMS property");
    }
}
