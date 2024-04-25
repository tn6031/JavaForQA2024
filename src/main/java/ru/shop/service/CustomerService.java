package ru.shop.service;

import exeption.EntityNotFoundException;
import model.Customer;
import repository.CustomerRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CustomerService  {

    private final CustomerRepository repository;
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }


    public void save(Customer product) {
        repository.save(product);
    }


    public List<Customer> findAll() {
        return repository.findALL();
    }

public Optional<Customer> findById(UUID id) {

    return repository.findById(id);
}

    public Customer getbyId(UUID id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
