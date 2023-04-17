package lesson11.exercise.mvc_arraylist_linkedlist.view;

import lesson11.exercise.mvc_arraylist_linkedlist.controller.ProductController;

public class ProductManagement {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayProduct();
    }
}
