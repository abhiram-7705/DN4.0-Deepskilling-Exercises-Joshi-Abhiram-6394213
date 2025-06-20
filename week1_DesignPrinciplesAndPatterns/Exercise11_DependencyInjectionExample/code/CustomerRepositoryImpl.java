import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository{
    
    Map<Integer,String> customers=new HashMap<>();

    public boolean findCustomerById(int id)
    {
        if(customers.containsKey(id))
        {
            return true;
        }
        return false;
    }

    public void addCustomer(Customer c)
    {
        customers.put(c.getId(),c.getName());
    }

}
