package lesson16.exercise.product_management.repository;

import lesson16.exercise.product_management.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getListProduct();

    void addNewProduct(List<Product> productList);

    int getIndexToName(String name);

    void findProduct(int index);
}
