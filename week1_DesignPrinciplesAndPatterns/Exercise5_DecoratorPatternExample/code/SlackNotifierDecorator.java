public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier obj)
    {
        super(obj);
    }
    public void send() {
        obj.send();
        System.out.println("adding new Slack property");
    }
}
