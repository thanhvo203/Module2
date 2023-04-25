package lesson16.exercise.product_management.repository;

import lesson16.exercise.product_management.model.Product;
import lesson16.exercise.product_management.util.ReadFile;
import lesson16.exercise.product_management.util.WriteFIle;

import java.util.List;

public class ProductRepository implements IProductRepository{
    private ReadFile read = new ReadFile();
    private WriteFIle write = new WriteFIle();

    @Override
    public List<Product> getListProduct() {
        return read.read();
    }

    @Override
    public void addNewProduct(List<Product> productList) {
         write.write(productList);
    }

    @Override
    public int getIndexToName(String name) {
        for (int i = 0; i < this.getListProduct().size(); i++) {
            if (getListProduct().get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findProduct(int index) {
        System.out.println(this.getListProduct().get(index));
    }
}
