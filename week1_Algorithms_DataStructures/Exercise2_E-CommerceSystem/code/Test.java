public class Test {
    public static void main(String[] args) {
        
        System.out.println("creating an E-Commerce platform");
        Platform platform=new Platform();

        System.out.println("creating an array of products for linear search");
        Product[] arr1 = {
        new Product(10, "Shirt", "Fashion"),
        new Product(3, "Shoes", "Fashion"),
        new Product(7, "Bat", "Sports"),
        new Product(1, "Laptop", "Electronics"),
        new Product(8, "Watch", "Accessories"),
        new Product(2, "Ball", "Sports"),
        new Product(6, "Phone", "Electronics"),
        new Product(4, "Headphones", "Electronics"),
        new Product(9, "Jacket", "Fashion"),
        new Product(5, "Bag", "Travel")
        };
        System.out.println("searching for a product with id '6' using linear search");
        platform.linearSearch(6, arr1);

        System.out.println("creating a sorted array of products for binary search");
        Product[] arr2 = {
        new Product(1, "Laptop", "Electronics"),
        new Product(2, "Ball", "Sports"),
        new Product(3, "Shoes", "Fashion"),
        new Product(4, "Headphones", "Electronics"),
        new Product(5, "Bag", "Travel"),
        new Product(6, "Phone", "Electronics"),
        new Product(7, "Bat", "Sports"),
        new Product(8, "Watch", "Accessories"),
        new Product(9, "Jacket", "Fashion"),
        new Product(10, "Shirt", "Fashion")
        };

        System.out.println("searching for a product with id '8' using binary search");
        platform.binarySearch(8, arr2);

    }
}
