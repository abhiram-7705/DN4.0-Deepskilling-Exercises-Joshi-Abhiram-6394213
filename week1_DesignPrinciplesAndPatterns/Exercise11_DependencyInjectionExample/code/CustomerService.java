public class CustomerService {
    
    CustomerRepository rep;

    public CustomerService(CustomerRepository rep)
    {
        this.rep=rep;
    }

    public void addCustomer(Customer c)
    {
        rep.addCustomer(c);
    }

    public void displayCustomerById(int id)
    {
        if(rep.findCustomerById(id)==true)
        {
            System.out.println("Customer found with id : "+id);
        }
        else
        {
            System.out.println("cannot find the Customer with id : "+id);
        }
    }

}
