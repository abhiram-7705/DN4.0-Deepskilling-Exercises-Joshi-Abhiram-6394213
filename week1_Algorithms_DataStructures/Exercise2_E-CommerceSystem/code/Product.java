public class Product {
    private int productID;
    private String productName;
    private String category;

    public Product(int id,String name,String ctgry)
    {
        productID=id;
        productName=name;
        category=ctgry;
    }
    public int getID()
    {
        return productID;
    }

    public String toString()
    {
        return "Product id : "+productID+"\tProduct Name : "+productName+"\tCategory : "+category;
    }

}