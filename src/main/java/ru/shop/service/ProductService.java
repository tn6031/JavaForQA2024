package ru.shop.service;

import repository.IRepository;
import repository.ProductRepository;
import  model.ProductType;
import model.Product;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService<Product> {

    private final IRepository<Product> repository;
    public ProductService(IRepository<Product> repository) {
        this.repository = repository;
    }

    @Override
    public void save(Product product) {
        repository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return repository.findALL();
    }

    @Override
    public List<Product> findByType(ProductType productType) {
        List<Product> result = new ArrayList<>();
        for (Product product : findAll()) {
            if (product.getProductType().equals(productType)) {
                result.add(product);
            }
        }
        return result;
    }

}
