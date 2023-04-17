package lesson11.exercise.mvc_arraylist_linkedlist.repository;

import lesson11.exercise.mvc_arraylist_linkedlist.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepository {
    void addNewProduct(Product product);
    boolean editInfo(int id);
    boolean deleteId(int id);
    List<Product> displayProduct();
    int searchProduct(String name);
    void sort();
}
