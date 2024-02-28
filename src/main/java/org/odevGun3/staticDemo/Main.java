package org.odevGun3.staticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "Mouse";
        product.price = 300;

        productManager.add(product);

        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnection();
    }
}
