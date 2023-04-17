package lesson11.exercise.mvc_arraylist_linkedlist.service;

import lesson11.exercise.mvc_arraylist_linkedlist.model.Product;
import lesson11.exercise.mvc_arraylist_linkedlist.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class ProductService implements IProductService{
    Scanner sc = new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();
    @Override
    public void addNewProduct() {
        System.out.println("Enter the id :");
        int newID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name product: ");
        String newName = sc.nextLine();
        System.out.println("Enter price");
        int newPrice = sc.nextInt();
        Product newProduct = new Product(newID,newName,newPrice);
        productRepository.addNewProduct(newProduct);
        System.out.println("Add success: " + newProduct.getName());
    }
    @Override
    public void editByID() {
        System.out.println("Enter id product you want edit : ");
        int editID = Integer.parseInt(sc.nextLine());
        List<Product> products = productRepository.displayProduct();
        if(productRepository.editInfo(editID)){
            for(int i = 0 ; i < products.size(); i++) {
                if(editID == products.get(i).getId()) {
                    System.out.println("Enter name product: ");
                    String editName = sc.nextLine();
                    products.get(i).setName(editName);
                    System.out.println("Enter price product: ");
                    int editPrice = sc.nextInt();
                    products.get(i).setPrice(editPrice);
                }
            }
        }else {
            System.out.println("Not found ID");
        }
    }
    @Override
    public void deleteByID() {
        System.out.println("Enter id you wanna delete: ");
        int deleteID = sc.nextInt();
        boolean isDelete = productRepository.deleteId(deleteID);
        if(isDelete){
            System.out.println("Delete success");
        }else{
            System.out.println("Not found id");
        }
    }
    @Override
    public void displayProduct() {
        List<Product> productList = productRepository.displayProduct();
        for (Product product : productList) {
            System.out.println(product);
        }
    }
    @Override
    public void searchProduct() {
        System.out.println("Enter name product: ");
        String searchName = sc.nextLine();
        int checkName = productRepository.searchProduct(searchName);
        if(checkName >= 0){
            System.out.println(productRepository.displayProduct().get(checkName));
        }else{
            System.out.println("Not found name");
        }
    }

    @Override
    public void sort() {
      productRepository.sort();
    }
}
