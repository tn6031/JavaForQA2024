package ru.shop.controller;

import model.Customer;
import model.Order;
import org.springframework.web.bind.annotation.*;
import repository.OrderRepository;
import ru.shop.service.OrderService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/order")
public class OrderController {

    OrderService orderService = new OrderService(new OrderRepository());

    @GetMapping
    public List<Order> getAll() {
        return orderService.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Order> getById(@PathVariable UUID id) {
        return orderService.findById(id);

    }

}
