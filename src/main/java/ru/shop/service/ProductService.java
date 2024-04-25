package ru.shop.service;

import exeption.EntityNotFoundException;
import repository.ProductRepository;
import  model.ProductType;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProductService {

    private final ProductRepository repository;
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }


    public void save(Product product) {
        repository.save(product);
    }


    public List<Product> findAll() {
        return repository.findALL();
    }


    public List<Product> findByType(ProductType productType) {
        List<Product> result = new ArrayList<>();
        for (Product product : findAll()) {
            if (product.getProductType().equals(productType)) {
                result.add(product);
            }
        }
        return result;
    }

    public Optional<Product> findById(UUID id) {
        return repository.findById(id);
    }
public Product getbyId(UUID id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
}
}
