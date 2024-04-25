package ru.shop.service;

import exeption.EntityNotFoundException;
import model.Customer;
import model.Order;
import model.Product;
import repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class OrderService  {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }




    public void add(Customer customer, Product product, long count) {

        Order order = new Order(UUID.randomUUID(),customer.getId(), product.getId(), count,product.getCost() * count);
        repository.save(order);

    }

    public List<Order> findAll() {
        return repository.findALL();
    }


    public List<Order> findByCustomer(Customer customer) {
        List<Order> result = new ArrayList<>();

        for (Order order : findAll()) {
            if(order.getCustomerId() == customer.getId()) {
                result.add(order);
            }
        }
        return result;
    }

    public void getTotalCustomerAmount(Customer customer){
        long result = 0;
        for (Order order : findByCustomer(customer)) {

               result = result + order.getAmount();

        }

    }

    public Optional<Order> findById(UUID id) {
        return repository.findById(id);
    }
    public Order getbyId(UUID id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void save(Order order) {
        repository.save(order);
    }

}
