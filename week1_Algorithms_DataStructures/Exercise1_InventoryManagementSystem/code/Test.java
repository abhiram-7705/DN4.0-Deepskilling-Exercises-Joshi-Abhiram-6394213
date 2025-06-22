public class Test {
    public static void main(String[] args) {
        InventoryManager inventory=new InventoryManager();
        System.out.println("created a new inventory");

        System.out.println("adding a new product mobile");
        inventory.addProduct(1, "mobile", 10, 10000);

        System.out.println("adding a new product laptop");
        inventory.addProduct(2, "Laptop", 5, 50000);

        System.out.println("adding a new product mobile");
        inventory.addProduct(3, "TV", 15, 20000);

        System.out.println("products in inventory : ");
        inventory.display();

        System.out.println("updating product quantity of mobile and price of laptop");
        inventory.updateProductQuantity(1, 20);
        inventory.updateProductPrice(2, 60000);

        System.out.println("products in inventory : ");
        inventory.display();

        System.out.println("deleting TV from inventory");
        inventory.deleteProduct(3);

        System.out.println("products in inventory : ");
        inventory.display();


    }
}
