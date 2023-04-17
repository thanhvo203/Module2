package lesson11.exercise.mvc_arraylist_linkedlist.controller;

import lesson11.exercise.mvc_arraylist_linkedlist.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private ProductService productService = new ProductService();
    public void displayProduct(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("------MENU----" + "\n"+
                    "1. Add new product \n" +
                    "2. Edit information by id \n" +
                    "3. Delete product by it \n" +
                    "4. Display product \n" +
                    "5. Search product \n" +
                    "6. Sort product \n" +
                    "0. Out list");
                String choice = sc.nextLine();
                switch (choice){
                    case "1":
                        productService.addNewProduct();
                        break;
                    case "2":
                        productService.editByID();
                        break;
                    case "3":
                        productService.deleteByID();
                        break;
                    case "4":
                        productService.displayProduct();
                        break;
                    case "5":
                        productService.searchProduct();
                         break;
                    case "6":
                        productService.sort();
                        break;
                }
        }while (flag);
    }
}
