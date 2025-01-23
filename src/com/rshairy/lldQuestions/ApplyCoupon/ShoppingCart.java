package com.rshairy.lldQuestions.ApplyCoupon;

import com.rshairy.lldQuestions.ApplyCoupon.coupons.PercentageCouponDecorator;
import com.rshairy.lldQuestions.ApplyCoupon.coupons.ProductTypeCouponDecorator;
import com.rshairy.lldQuestions.ApplyCoupon.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList;

    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    public void checkout() {
        double price = 0;
        for (Product product : productList) {
            price += product.getPrice();
        }
        System.out.println(price);
    }

    public void addToCart(Product product) {
        productList.add(new ProductTypeCouponDecorator(
                new PercentageCouponDecorator(product, 5),
                10,
                product.getProductType()));

    }
}
