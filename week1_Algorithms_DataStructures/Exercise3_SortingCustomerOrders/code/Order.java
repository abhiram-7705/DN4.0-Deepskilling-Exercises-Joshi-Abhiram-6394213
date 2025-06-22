public class Order {
    private int orderID;
    private String customerName;
    private double totalPrice;

    public Order(int id,String name,double price)
    {
        this.orderID=id;
        this.customerName=name;
        this.totalPrice=price;
    }

    public double getPrice() {
        return totalPrice;
    }
    public String toString()
    {
        return orderID+"\t"+customerName+"\t"+totalPrice;
    }

}