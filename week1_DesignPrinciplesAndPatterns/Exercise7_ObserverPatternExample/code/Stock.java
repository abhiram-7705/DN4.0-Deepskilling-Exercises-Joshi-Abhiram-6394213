public interface Stock {

    public void register(Observer obs);
    public void deregister(Observer obs);
    public void notifyObservers();

}