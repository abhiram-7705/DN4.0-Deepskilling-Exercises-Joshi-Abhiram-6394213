public class Logger {
    
    private int count=0;
    private Logger()
    {
        count++;
        System.out.println("inside the Logger constructor");
        System.out.println("no.of times instance is created : "+count+"\n");
    }

    private static class LoggerInstance
    {
        private static final Logger instance = new Logger();
    }

    public static Logger getInstance()
    {
        return LoggerInstance.instance;
    }
}
