package ru.shop.controller;

import model.Customer;

import org.springframework.web.bind.annotation.*;
import repository.CustomerRepository;
import ru.shop.service.CustomerService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;




@RestController
@RequestMapping("/customer")
public class CustomerController {

    CustomerService customerService = new CustomerService(new CustomerRepository());

    @GetMapping
    public List<Customer> getAll() {
        return customerService.findAll();
    }

    @PostMapping
    public void save(@RequestBody Customer customer) {
        customerService.save(customer);
    }

    @GetMapping("/{id}")
    public Optional<Customer> getById(@PathVariable UUID id) {
        return customerService.findById(id);

    }

}
