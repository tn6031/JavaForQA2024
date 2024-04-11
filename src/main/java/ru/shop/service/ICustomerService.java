package ru.shop.service;

import model.Customer;

import java.util.List;

public interface ICustomerService<T> {
    void save(Customer product);

    List<T> findAll();
}
