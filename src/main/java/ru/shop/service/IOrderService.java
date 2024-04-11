package ru.shop.service;

import model.Customer;
import model.Order;
import model.Product;

import java.util.List;

public interface IOrderService<T> {
    void add(Customer customer, Product product, long count);

    List<T> findAll();

    List<T> findByCustomer(Customer customer);

    void getTotalCustomerAmount(Customer customer);
}
