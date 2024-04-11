package repository;
import model.Customer;
import java.util.List;
import java.util.ArrayList;

public class CustomerRepository implements IRepository<Customer> {
    List<Customer> customers = new ArrayList<>();

    @Override
    public void save(Customer customer) {

    customers.add(customer);
    }
    @Override
    public  List <Customer> findALL(){
        return customers;
    }
}
