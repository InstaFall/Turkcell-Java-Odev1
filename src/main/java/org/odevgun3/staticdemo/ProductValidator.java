package org.odevgun3.staticdemo;

public class ProductValidator {
    public static boolean isValid(Product product) {
        return (product.price > 0 && !product.name.isEmpty());
    }
}
