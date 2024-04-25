package repository;

import model.Customer;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProductRepository {
    List<Product> products = new ArrayList<>();

    public void save(Product product) {

        products.add(product);
    }
    public  List <Product> findALL(){
        return products;
    }

    public Optional<Product> findById(UUID id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return Optional.of(product);
            }

        }
        return Optional.empty();
    }
}
