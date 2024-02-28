package org.odevGun3.staticDemo;

public class ProductManager {
    public void add(Product product) {
        //ProductValidator validator = new ProductValidator();
        if (ProductValidator.isValid(product)) System.out.println("Added product: " + product.name);
        else System.out.println("Product data is invalid");
    }
}
