package ru.shop.service;

import model.Customer;
import model.Order;
import model.Product;
import repository.IRepository;
import repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderService implements IOrderService<Order> {

    private final IRepository<Order> repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }



    @Override
    public void add(Customer customer, Product product, long count) {

        Order order = new Order(UUID.randomUUID(),customer.getId(), product.getId(), count,product.getCost() * count);
        repository.save(order);

    }
    @Override
    public List<Order> findAll() {
        return repository.findALL();
    }

    @Override
    public List<Order> findByCustomer(Customer customer) {
        List<Order> result = new ArrayList<>();

        for (Order order : findAll()) {
            if(order.getCustomerId() == customer.getId()) {
                result.add(order);
            }
        }
        return result;
    }
    @Override
    public void getTotalCustomerAmount(Customer customer){
        long result = 0;
        for (Order order : findByCustomer(customer)) {

               result = result + order.getAmount();

        }

    }

}
