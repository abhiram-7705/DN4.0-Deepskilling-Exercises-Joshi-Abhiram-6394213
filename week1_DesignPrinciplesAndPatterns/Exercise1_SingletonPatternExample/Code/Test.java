public class Test
{
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        System.out.println("Logger class instance is stored in 'l1'\n");

        Logger l2=Logger.getInstance();
        System.out.println("Logger class instance is stored in 'l2'\n");

        if(l1==l2)
        {
            System.out.println("both the reference variables contain the same instance of Logger\n");
        }
        else
        {
            System.out.println("both the reference variables contain difference instance of Logger\n");
        }
    }
}