package lesson11.exercise.mvc_arraylist_linkedlist.repository;

import lesson11.exercise.mvc_arraylist_linkedlist.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add( new Product(100, "Laptop", 20000));
        products.add( new Product(200, "Computer", 10000));
        products.add( new Product(300, "TV", 15000));

    }

    @Override
    public void addNewProduct(Product product) {
          products.add(product);
    }

    @Override
    public boolean editInfo(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteId(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                return true;
            }
        }
        return false;
    }
    @Override
    public List<Product> displayProduct() {
        return products;
    }

    @Override
    public int searchProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getName().equals(name)){
               return i;
            }
        }
        return -1;
    }

    @Override
    public void sort() {
        products.sort((o1, o2) -> o1.getPrice() - o2.getPrice());
    }
}
