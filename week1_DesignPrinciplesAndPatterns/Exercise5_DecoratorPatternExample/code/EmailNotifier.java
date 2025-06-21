public class EmailNotifier implements Notifier{
    private String notification;
    public EmailNotifier(String notification)
    {
        this.notification=notification;
    }
    public void send()
    {
        System.out.println("an email notification is generated : "+notification);
    }
}
