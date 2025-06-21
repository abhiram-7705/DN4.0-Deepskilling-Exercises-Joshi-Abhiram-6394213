public abstract class NotifierDecorator implements Notifier {
    Notifier obj;
    public NotifierDecorator(Notifier obj)
    {
        this.obj=obj;
    }
}
