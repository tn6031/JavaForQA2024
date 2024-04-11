package repository;

import model.Customer;

import java.util.List;

public interface IRepository<T> {
    void save(T entity);

    List<T> findALL();
}
