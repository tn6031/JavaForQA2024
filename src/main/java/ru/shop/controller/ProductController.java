package ru.shop.controller;

import model.Product;
import model.ProductType;
import org.springframework.web.bind.annotation.*;
import repository.ProductRepository;
import ru.shop.service.ProductService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    ProductService productService = new ProductService(new ProductRepository());

    @GetMapping
    public List<Product> getAll() {
        return productService.findAll();
    }

    @PostMapping
    public void save(@RequestBody Product product) {
        productService.save(product);
    }

    @GetMapping("/type/{ProductType}")
    public List getByProductType(@PathVariable ProductType productType) {
        return Collections.singletonList(productType);

    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable UUID id) {
        return productService.findById(id);
    }

}









