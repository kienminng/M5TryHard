package com.example.angularm5.Service;

import java.util.List;

public interface CrudService<T> {
    List<T> getAll();

    T save(T t);

    void delete(int id);

    T findById(int id);
}
