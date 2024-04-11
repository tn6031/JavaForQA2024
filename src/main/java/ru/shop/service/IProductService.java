package ru.shop.service;

import model.Product;
import model.ProductType;

import java.util.List;

public interface IProductService<T> {
    void save(Product product);

    List<T> findAll();

    List<T> findByType(ProductType productType);
}
