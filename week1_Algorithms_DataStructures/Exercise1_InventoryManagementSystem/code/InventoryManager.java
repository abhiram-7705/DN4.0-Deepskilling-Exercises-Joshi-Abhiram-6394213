import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    Map<Integer,Product> products=new HashMap<>();
   
    public void addProduct(int id,String name,int qty,double pr)
    {
        products.put(id, new Product(id, name, qty, pr));
    }
    public void updateProductQuantity(int id,int qty)
    {
        Product p=products.get(id);
        p.setQuantity(qty);
    }
    public void updateProductPrice(int id,double pr)
    {
        Product p=products.get(id);
        p.setPrice(pr);
    }

    public void deleteProduct(int id)
    {
        products.remove(id);
    }
    public void display()
    {
        for(Product p: products.values())
        {
            System.out.println(p.toString());
        }
    }

}
