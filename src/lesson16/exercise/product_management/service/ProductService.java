package lesson16.exercise.product_management.service;

import lesson16.exercise.product_management.model.Product;
import lesson16.exercise.product_management.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    private Scanner sc = new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();
    private List<Product> productList = new ArrayList<>();
    @Override
    public void addNewProduct() {
        System.out.println("nhập mã sản phấm mới");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên sản phẩm mới");
        String name = sc.nextLine();
        System.out.println("nhập giá sản phẩm");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("nhập hãng sản xuất");
        String manufacturer = sc.nextLine();
        System.out.println("nhập mô tả sản phẩm");
        String describe = sc.nextLine();
        Product newProduct = new Product(id,name,price,manufacturer,describe);
        productList= productRepository.getListProduct();
        productList.add(newProduct);
        productRepository.addNewProduct(productList);
    }

    @Override
    public void findProduct() {
        System.out.println("nhập tên sản phẩm cần tìm kiếm");
        String name = sc.nextLine();
        if (productRepository.getIndexToName(name)!=-1){
            productRepository.findProduct(productRepository.getIndexToName(name));
        }else {
            System.out.println("không tìm thấy sản phẩm");
        }
    }
    @Override
    public void showListProduct() {
        productList = productRepository.getListProduct();
        for (Product p:productList) {
            System.out.println(p);
        }
    }

}
