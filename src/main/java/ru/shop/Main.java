package ru.shop;

import model.Customer;
import model.Order;
import model.Product;
import model.ProductType;
import repository.CustomerRepository;
import repository.OrderRepository;
import repository.ProductRepository;
import ru.shop.service.CustomerService;
import ru.shop.service.OrderService;
import ru.shop.service.ProductService;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepository();
        OrderRepository OrderRepository = new OrderRepository();
        ProductRepository ProductRepository = new ProductRepository();
        OrderService orderService = new OrderService(OrderRepository);
        ProductService productService = new ProductService(ProductRepository);
        CustomerService customerService = new CustomerService(customerRepository);


        Product ladaKalina = new Product(UUID.randomUUID(), "Lana Kalina", 100, ProductType.GOOD);
        productService.save(ladaKalina);

        Product DodgeCharger = new Product(UUID.randomUUID(), "DodgeCharger", 1000, ProductType.GOOD);
        productService.save(DodgeCharger);



        Customer ivan = new Customer(UUID.randomUUID(), "ivanushka", "11234567", 16);
        customerService.save(ivan);

        for(Customer customer : customerRepository.findALL()){
            System.out.println(customer);
        }
        for(Order order : OrderRepository.findALL()){
            System.out.println(order);
        }
        for(Product product : ProductRepository.findALL()){
            System.out.println(product);
        }

        orderService.add(ivan, ladaKalina,2);

        for (Order order : orderService.findAll()){
            System.out.println(order);
        }

        orderService.add(ivan, DodgeCharger,2);

        for (Order order : orderService.findAll()){
            System.out.println(order);
        }
        orderService.getTotalCustomerAmount(ivan);

    }
}