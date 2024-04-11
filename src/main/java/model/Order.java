package model;

import java.util.UUID;

public class Order {

    private UUID id;
    private UUID customerId;
    private UUID productId;
    private long count;
    private long amount;



    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", productId=" + productId +
                ", count=" + count +
                ", amount=" + amount +
                '}';
    }

    public Order(UUID id, UUID customerId, UUID productId,  long count, long amount) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.count = count;
        this.amount = amount;
    }

    public UUID getId() {
        return id;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public UUID getProductId() {
        return productId;
    }


    public long getCount() {
        return count;
    }

    public long getAmount() {
        return amount;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }


    public void setCount(long count) {
        this.count = count;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
