package codegym.service;

import codegym.Product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements ProductServiceInter{
    private static Map<Integer,Product> productMap = new HashMap<>();
    static {
        productMap.put(1,new Product(1,"PC","Asus",2200));
        productMap.put(2,new Product(2,"Laptop","Dell",2000));
        productMap.put(3,new Product(3,"IPhone","Apple",900));
        productMap.put(4,new Product(4,"Macbook","Apple",1500));
        productMap.put(5,new Product(5,"Microwave","Sharp",900));
        productMap.put(6,new Product(6,"Samsung Galaxy S22","SamSung",800));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void deleteProduct(int id) {
        productMap.remove(id);
    }

    @Override
    public void editProduct(int id, Product product) {
        productMap.put(id,product);
    }

}
