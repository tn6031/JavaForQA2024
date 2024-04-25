package model;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private long cost;
    private ProductType productType;

    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", productType=" + productType +
                '}';
    }

    public Product(UUID id, String name, long cost, ProductType productType) {
        this.id = id;
        this.name = name;

        this.cost = cost;
        this.productType = productType;
    }


    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setCost(long cost) {
        this.cost = cost;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public long getCost() {
        return cost;
    }

    public ProductType getProductType() {
        return productType;
    }
}
