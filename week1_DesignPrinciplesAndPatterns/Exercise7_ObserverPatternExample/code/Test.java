public class Test {
    public static void main(String[] args) {
        
        Stock market=new StockMarket();
        System.out.println("created a new stock"); 

        System.out.println("creating new Mobile App observer");
        Observer obs1=new MobileApp();

        System.out.println("creating new WebApp observer");
        Observer obs2=new WebApp();

        System.out.println("adding both observers to the market");
        market.register(obs1);
        market.register(obs2);


        System.out.println("notifying all the observers");
        market.notifyObservers();

        System.out.println("removing the WebApp user");
        market.deregister(obs2);
        
        System.out.println("notifying all the observers");
        market.notifyObservers();
    }
}
