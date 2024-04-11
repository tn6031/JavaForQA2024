package repository;

import model.Customer;
import model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository implements IRepository<Order> {

    List<Order> orders = new ArrayList<>();

    public void save(Order order) {

        orders.add(order);
    }
    public  List <Order> findALL(){
        return orders;
    }

}
