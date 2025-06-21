public class Test {
    public static void main(String[] args) {
        System.out.println("creating an email notification...");
        Notifier obj=new EmailNotifier("this is an email notification");
        obj.send();

        System.out.println("using SMS decorator to add new SMS property");
        NotifierDecorator smsobj=new SMSNotifierDecorator(obj);
        smsobj.send();
        
        System.out.println("using SMS decorator and Slack decorator to add both properties");
        NotifierDecorator slack=new SlackNotifierDecorator(smsobj);
        slack.send();
    }
}
