package org.odevGun3.staticDemo;

public class ProductValidator {
    public static boolean isValid(Product product) {
        return (product.price > 0 && !product.name.isEmpty());
    }
}
