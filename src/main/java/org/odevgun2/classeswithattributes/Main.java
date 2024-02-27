package org.odevgun2.classeswithattributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(3000);
        product.setStockAmount(15);

        Product product2 = new Product(2,"Mouse","Logitech Mouse",200,20,"2");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCode());
        System.out.println(product2.getCode());
    }
}
