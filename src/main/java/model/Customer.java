package model;

import java.util.UUID;

public class Customer {
    private UUID id;
    private String name;
    private String phone;
    private long age;

    public Customer() {

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }

    public Customer(UUID id, String name, String phone, long age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public long getAge() {
        return age;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
