import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{

    List<Observer> observers=new ArrayList<>();
    public void register(Observer obs) {
       observers.add(obs);
    }

    public void deregister(Observer obs) {
       observers.remove(obs);
    }

    public void notifyObservers() {
      for(Observer obs:observers)
      {
        obs.update();
      }
    }
    
}
