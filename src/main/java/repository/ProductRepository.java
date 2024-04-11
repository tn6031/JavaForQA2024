package repository;

import model.Customer;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IRepository<Product> {
    List<Product> products = new ArrayList<>();

    public void save(Product product) {

        products.add(product);
    }
    public  List <Product> findALL(){
        return products;
    }
}
