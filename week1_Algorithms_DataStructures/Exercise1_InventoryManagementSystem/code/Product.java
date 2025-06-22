public class Product {
    private int productID;
    private String productName;
    private int quantity;
    private double price;

    public Product(int id,String name,int qty,double pr)
    {
        productID=id;
        productName=name;
        quantity=qty;
        price=pr;
    }

    public void setQuantity(int qty) {
        quantity=qty;    
    }

    public void setPrice(double pr) {
        price=pr;    
    }

    public String toString()
    {
        return "Product id : "+productID+"\tProduct Name : "+productName+"\tQuantity : "+quantity+"\tPrice : "+price;
    }

}