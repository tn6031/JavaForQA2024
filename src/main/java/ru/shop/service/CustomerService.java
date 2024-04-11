package ru.shop.service;

import model.Customer;
import model.Product;
import model.ProductType;
import repository.CustomerRepository;
import repository.IRepository;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService<Customer> {

    private final IRepository<Customer> repository;
    public CustomerService(IRepository<Customer> repository) {
        this.repository = repository;
    }

    @Override
    public void save(Customer product) {
        repository.save(product);
    }

    @Override
    public List<Customer> findAll() {
        return repository.findALL();
    }



}
