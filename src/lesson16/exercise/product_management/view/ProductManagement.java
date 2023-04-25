package lesson16.exercise.product_management.view;

import lesson16.exercise.product_management.controller.ProductController;

public class ProductManagement {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showMenu();
    }
}
