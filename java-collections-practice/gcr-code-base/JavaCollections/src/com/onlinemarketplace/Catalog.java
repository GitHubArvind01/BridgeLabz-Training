package com.onlinemarketplace;
import java.util.*;

public class Catalog {
	List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public List<Product<?>> getProducts() {
        return products;
    }
}
