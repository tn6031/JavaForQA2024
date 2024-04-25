package repository;
import model.Customer;
import model.Product;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class CustomerRepository  {
    List<Customer> customers = new ArrayList<>();


    public void save(Customer customer) {

    customers.add(customer);
    }

    public  List <Customer> findALL(){
        return customers;
    }

    public Optional<Customer> findById(UUID id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return Optional.of(customer);
            }

        }
        return Optional.empty();
    }

}
