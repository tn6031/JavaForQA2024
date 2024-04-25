package ru.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.shop.model.Customer;
import ru.shop.repository.CustomerRepository;
import ru.shop.service.CustomerService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

   private final CustomerService customerService;


    @GetMapping
    public List<Customer> getAll() {
        return customerService.findAll();
    }

    @PostMapping
    public void save(@RequestBody Customer customer) {
        customerService.save(customer);
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable UUID id) {
        return customerService.getById(id);
    }
}