public class Main {
    public static void main(String[] args) {
        
        CustomerRepository rep=new CustomerRepositoryImpl();
        CustomerService service=new CustomerService(rep);

        System.out.println("creating a customer");
        Customer c=new Customer("abhiram", 28);

        System.out.println("adding customer");
        service.addCustomer(c);
        
        System.out.println("searching for a customer with id '28'");
        service.displayCustomerById(28);
        
        System.out.println("searching for a customer with id '82'");
        service.displayCustomerById(82);
        
    }
}
